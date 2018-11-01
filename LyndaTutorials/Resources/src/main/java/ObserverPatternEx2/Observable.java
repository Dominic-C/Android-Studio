package ObserverPatternEx2;

public interface Observable {
    // An observable is an object which notifies observers about the changes in its state.
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
