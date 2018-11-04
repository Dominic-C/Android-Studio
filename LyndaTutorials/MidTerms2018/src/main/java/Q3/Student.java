package Q3;

public class Student implements Observer{
    private String id;

    public Student(String id, Subject sub) {
        this.id = id;
        sub.register(this);

    }

    @Override
    public void update(int t) {
        System.out.println("Student " + this.id + " receives temperature alert: " + t);
    }
}