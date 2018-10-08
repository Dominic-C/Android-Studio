package Observer;

public class MyTopic {
    public static void main(String[] args) {
        Topic topic50001 = new Topic();

        Subscriber man = new Subscriber(topic50001, "man");

        Subscriber norman = new Subscriber(topic50001, "norman");

        topic50001.addMessage("Mock test!");
    }
}
