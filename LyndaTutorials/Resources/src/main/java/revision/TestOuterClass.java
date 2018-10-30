package revision;

public class TestOuterClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(); // one object of outer class

        OuterClass.InnerClass innerClass = outerClass.new InnerClass(); // one object of inner class

        // show 1
        innerClass.innerPrintA();

        // show that these are the same objects
        OuterClass outerClass1 = innerClass.giveBackOuter();
        System.out.println(outerClass == outerClass1);
    }
}
