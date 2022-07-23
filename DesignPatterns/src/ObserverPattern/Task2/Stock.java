package ObserverPattern.Task2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Stock implements Observable {
	
	private List<Observer> observers;
	
	public Stock() {
		observers=new ArrayList<>();
	}

	private String nameAirLines;
	private String flightNumber;
	private String FlyingDestination;
	private Date flightTime;
	
	public String getNameAirLines() {
		return nameAirLines;
	}
	
	public void setStockFlightNumber(String fligthNumber) {
		this.flightNumber=fligthNumber;
	}
	
	public void setFlyingDestination(String destination) {
		this.FlyingDestination=destination;
	}
	
	public String getStockFlightNumber() {
		return flightNumber;
	}
	
	public String getStockFlyingDestination() {
		return FlyingDestination;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		if(observer!=null) {
			observers.add(observer);
		}
	}
	

	@Override
	public void notifyObserver() {
		Iterator<Observer> it=observers.iterator();
		while(it.hasNext()) {
			Observer observer=it.next();
			observer.update(this);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observer!=null) {
			observers.remove(observer);
		}
	}
	
	public Date getStockFligtTime() {
			return flightTime;
		}
	
	public void updateStockFlightTime(Date UpdateFlightTime) {
		this.flightTime=UpdateFlightTime;
		notifyObserver();
	}
	
	public void setName(String name) {
		this.nameAirLines=name;
	}
	

}
