package ObserverPattern;

public interface Observer {

    // method to update observer used by subject
    public void update(String s);
    // method to attach observer to subject
    //public void setSubject(Subject sub);
}
