package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Topic math = new Topic();
        Subscriber bobby = new Subscriber(math, "bobby");
        Subscriber John = new Subscriber(math, "Johnny");

        math.setMessage("Warning letters!!");
        math.unregister(John);

        math.setMessage("warning to bobby!");
    }

}
