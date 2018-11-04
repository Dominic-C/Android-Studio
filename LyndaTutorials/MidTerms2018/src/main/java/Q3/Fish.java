package Q3;

public class Fish implements Observer {
    private String id;

    public Fish(String id, Subject sub) {
        this.id = id;
        sub.register(this);
    }

    @Override
    public void update(int t) {
        System.out.println("Fish " + this.id + " receives temperature alert: " + t);
    }
}
