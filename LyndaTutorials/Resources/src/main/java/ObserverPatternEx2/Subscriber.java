package ObserverPatternEx2;

public class Subscriber implements Observer {
    String ID;

    Subscriber(String id, Observable sub)
    {
        this.ID = id;
        // can register observer to subject here or in main
        sub.register(this);
    }
    @Override
    public void update(String news) {
        System.out.println(this.ID + " received news: " + news);
    }
}
