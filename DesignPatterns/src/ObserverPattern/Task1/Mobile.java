package ObserverPattern.Task1;

public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Mobile- The Price of " + stock.getStockName() + " has changed: " + stock.getStockPrice());
	}

}
