package Q3;

public interface Subject {

    void notifyObservers();
    void unregister(Observer o);
    void register(Observer o);

}