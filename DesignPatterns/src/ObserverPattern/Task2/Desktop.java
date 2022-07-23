package ObserverPattern.Task2;

public class Desktop implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Desktop--> The : "+stock.getNameAirLines()
		+" with number flight: "+stock.getStockFlightNumber()
		+" that has destination : "+stock.getStockFlyingDestination()
		+" has been changing to :"+stock.getStockFligtTime());
		
		
	}

}
