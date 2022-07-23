package ObserverPattern.Task2;

public interface Observable {
	public void registerObserver(Observer observer);
	public void notifyObserver();
	public void removeObserver(Observer observer);

}
