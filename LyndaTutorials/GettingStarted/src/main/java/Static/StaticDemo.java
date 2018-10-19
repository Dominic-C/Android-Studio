package Static;

class Employee
{
    int eid;
    int salary;
    static String ceo; // dont want ceo to be object specific

    static // runs when you load a class, only once, class loaded once
    {
        ceo = "Larry";
        System.out.println("In static");
    }

    public Employee()
    {
        eid = 1;
        salary = 3000;
        System.out.println("In constructor"); // in this example, called twice because we have 2 Employee objects
    }

    public void show()
    {
        System.out.println("eid: " + eid + " salary: " + salary + " ceo: " + ceo );
    }
}

public class StaticDemo {

    public static void main(String [] args) // static, because we dont need an object to call main, we make it static
    {
        Employee navin = new Employee();
        navin.eid = 8;
        navin.salary = 4000;
//        navin.ceo = "Mahesh";

        navin.show();

        Employee rahul = new Employee();
        rahul.eid = 9;
        rahul.salary = 3000;
        rahul.ceo = "Mahesh";

        rahul.show();

        Employee.ceo = "Not Mahesh"; // use class name to access static variables

        navin.show();
        rahul.show();
    }
}
