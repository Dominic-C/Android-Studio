package ObserverPatternEx2;

public class Main {
    public static void main(String[] args) {
        Topic tldr = new Topic();
        Subscriber norman = new Subscriber("12345", tldr);
        Subscriber Man = new Subscriber("45321", tldr);

        // updating
        tldr.updateStatus("Hello and welcome to 50.001 mid terms!");

    }
}
