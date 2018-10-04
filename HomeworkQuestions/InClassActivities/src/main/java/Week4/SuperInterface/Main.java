package Week4.SuperInterface;

public abstract class Main extends Object implements Interface1 {

}

class Class2 extends Main
{
    @Override
    public void p1() {
        System.out.println("from p1");
    }

    @Override
    public void p2() {
        System.out.println("from p2");
    }

    @Override
    public void p3() {
        System.out.println("from p3");
    }

    @Override
    public void pz() {
        System.out.println("from p4");
    }
}