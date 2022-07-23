package ObserverPattern.Task1;

public class Desktop implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Desktop- The Price of "
				+stock.getStockName()+ " has changed: "
				+stock.getStockPrice());
		
	}

}
