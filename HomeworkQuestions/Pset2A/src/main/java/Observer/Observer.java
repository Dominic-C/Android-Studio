package Observer;

import java.util.ArrayList;

interface Observer{
	void update(double airPollutionIndex);
}

class Subscriber implements Observer{
	private Subject subject;
	private String observerId;
	public static String outputMessage = "";
	
	public Subscriber(String observerId, Subject subject){
		this.subject=subject;
		this.observerId = observerId;		
		this.subject.register(this);		// register itself
	}

	@Override
	public void update(double airPollutionIndex) {
		String s = this.observerId + " received notification: " + airPollutionIndex;
		System.out.println(s);
		outputMessage += (s + " ");
	}
}

interface Subject{
	void register(Observer o);
	void unregister(Observer o);
	void notifyObservers();
}

//TODO: modify AirPollutionAlert to implement interface Subject, under Observer design pattern
class AirPollutionAlert implements Subject{
	private double airPollutionIndex;

	ArrayList<Observer> l = new ArrayList<>();
	@Override
	public void register(Observer o) {
		l.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int indexOfObserver = l.indexOf(o);
		l.remove(indexOfObserver);
	}

	@Override
	public void notifyObservers() { // this method is called when any notable change occurs
		for(Observer o : l)
		{
			o.update(airPollutionIndex);
		}
	}

	public void setAirPollutionIndex(double airPollutionIndex) { // when any change occurs, notify my observers
		this.airPollutionIndex = airPollutionIndex;
		if(airPollutionIndex > 100)
		{
			notifyObservers();
		}
	}
}