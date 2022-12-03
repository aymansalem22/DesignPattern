package ObserverPattern.Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stock implements Observable {
	private List<Observer> observers;

	public Stock() {
		observers = new ArrayList<>();
	}

	private String name;
	private int price;

	public String getStockName() {
		return name;
	}

	@Override
	public void registerObserver(Observer observer) {
		if (observer != null) {
			observers.add(observer);
		}

	}

	@Override
	public void notifyObserver() {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer observer = it.next();
			observer.update(this);
		}

	}

	@Override
	public void removeObserver(Observer observer) {
		if (observer != null) {
			observers.remove(observer);
		}

	}

	public int getStockPrice() {
		return price;
	}

	public void updateStockPrice(int updatePrice) {
		this.price = updatePrice;
		notifyObserver();
	}

	public void setName(String name) {
		this.name = name;
	}

}
