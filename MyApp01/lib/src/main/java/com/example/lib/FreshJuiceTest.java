class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDUIM, LARGE}
    FreshJuiceSize size; // create a FreshJuiceSize Object called size
}

public class FreshJuiceTest {

    public static void main(String args[])
    {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDUIM;
        System.out.println("Size: " + juice.size);
    }
}