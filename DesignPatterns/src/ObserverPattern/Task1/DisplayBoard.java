package ObserverPattern.Task1;

public class DisplayBoard implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Display Board- The Price of "
				+stock.getStockName()+" has changed: "
				+stock.getStockPrice());
	}

}
