package Q3;

import java.util.ArrayList;

//starting code

public class TemperatureAlert implements Subject {
    private int temperature;

    ArrayList<Observer> obs = new ArrayList<>();

    public TemperatureAlert() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if(this.temperature > 35 || this.temperature < 10)
            notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer o : obs)
        {
            o.update(this.temperature);
        }
    }

    @Override
    public void unregister(Observer o) {
        obs.remove(o);
    }

    @Override
    public void register(Observer o) {
        obs.add(o);
    }
}
