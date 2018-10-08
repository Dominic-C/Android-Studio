package Observer;

import java.util.ArrayList;

public class Topic implements Subject {

    private ArrayList<Observer> observerList = null;
    private String message;

    Topic ()
    {
        observerList = new ArrayList<Observer>();

    }

    @Override
    public void register(Observer o)
    {
        observerList.add(o);
    }

    @Override
    public void unregister (Observer o)
    {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers()
    {
        for(Observer o: observerList)
        {
            o.update(this.message);
        }
    }

    public void addMessage(String message)
    {
        this.message = message;
        notifyObservers();
    }
}
