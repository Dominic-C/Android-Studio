package Observer;

public class Subscriber implements Observer{

    // whenever we create a subscriber, we create this fields

    private String id;
    private Subject s;

    Subscriber (Subject s, String id)
    {
        this.id = id;
        s.register(this); // register this subscriber in subject

        this.s = s;
    }

    @Override
    public void update(String message){
        System.out.println(id + "receives message: " + message);
    }
}
