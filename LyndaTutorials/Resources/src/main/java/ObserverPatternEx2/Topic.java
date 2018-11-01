package ObserverPatternEx2;

import java.util.ArrayList;

public class Topic implements Observable {

    // have an array of observers
    private ArrayList<Observer> observers = new ArrayList<>();

    static String s = "";
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observers)
        {
            obs.update(s);
        }
    }

    // after changes, update observers
    public void updateStatus(String s1)
    {
        s = s1;
        notifyObservers();
    }
}
