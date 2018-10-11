package Visitor;

import java.util.ArrayList;

public class Main { // faster than using if else. because methods are resolved at compile time. If else statements are run at rum time.
    public static void main(String[] args) {
        // two key ways to allow visitors and acceptors to work
        /*
        * 1. visitor instance visits objects in a list
        *       - this means that the visitor will use its appropriate visit overloaded method for the object
        *       - cannot do this for the visitable interface because the interface does not have implementation for visit
        * 2. visitable objects accept visitors
        *       - this means that objects will accept a visitor
        *       - accept will call the visitor to visit that object
        * */


//        ArrayList<Book> bookshelf = new ArrayList<>();
//        bookshelf.add(new Book(5));
//        bookshelf.add(new Book(2));
//        bookshelf.add(new Book(5));
//
//        PackagingCostVisitor vi = new PackagingCostVisitor();
//
//        for(Book b : bookshelf)
//        {
//            vi.visit(b);
//        }
//
//        System.out.println("Total cost = " + vi.getTotal());

        ArrayList<Visitable> listsofItems = new ArrayList<>();
        listsofItems.add(new Book(3));
        listsofItems.add(new CD(3));

        PackagingCostVisitor vis = new PackagingCostVisitor();

        for(Visitable v : listsofItems)
        {
//            vis.visit(v); // cannot do this because there is no visit method defined in the interface/
            v.accept(vis);
        }

        System.out.println("Total cost: " + vis.getTotal());
    }
}
