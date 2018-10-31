package ObserverPattern;

public interface Subject {
    // publisher
    /*
    * Job scope of publisher:
    * register, unregister, notify observers of change
    *
    * */

    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();

}
