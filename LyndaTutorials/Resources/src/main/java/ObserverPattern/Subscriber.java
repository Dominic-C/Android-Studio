package ObserverPattern;

public class Subscriber implements Observer {
    private String ID;
    private Subject subj;

    Subscriber(Subject sub, String id)
    {
//        this.subj = sub; this doesnt do anything. Instead, we want to use the subject to register this observer
        sub.register(this); // can do the register here or in the main
        this.ID = id;
    }

    @Override
    public void update(String s) {
        System.out.println(ID + "Recieved message: " + s);
    }
}
