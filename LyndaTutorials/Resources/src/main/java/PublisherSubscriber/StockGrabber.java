package PublisherSubscriber;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    // Store observers in an array list
    private ArrayList<Observer> observers;

    private double ibmprice;
    private double appleprice;
    private double googPrice;

    public StockGrabber()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer " + (observerIndex + 1) + " was deleted.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer obs : observers)
        {
            obs.update(ibmprice, appleprice, googPrice);
        }
    }

    public void setIBMprice(double newIBMprice)
    {
        this.ibmprice = newIBMprice;
        notifyObserver();
    }


    public void setApplePrice(double newApplePrice)
    {
        this.appleprice = newApplePrice;
        notifyObserver();
    }


    public void setGooglePrice(double newGooglePrice)
    {
        this.googPrice = newGooglePrice;
        notifyObserver();
    }
}
