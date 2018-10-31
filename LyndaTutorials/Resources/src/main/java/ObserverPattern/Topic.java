package ObserverPattern;

import java.util.ArrayList;

public class Topic implements Subject {

    private ArrayList<Observer> subscribers;
    private String message;

    Topic(){
        subscribers = new ArrayList<Observer>();
    }


    @Override
    public void register(Observer obj) {
        subscribers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        subscribers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        // use update method to notify observers
        for(Observer o : subscribers)
        {
            o.update(this.message);
        }
    }
    public void setMessage(String m)
    {
        this.message = m;
        notifyObservers();
    }

}
