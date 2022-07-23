package ObserverPattern.Task2;

public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Mobile--> The : "+stock.getNameAirLines()
		+" with number flight: "+stock.getStockFlightNumber()
		+" that has destination : "+stock.getStockFlyingDestination()
		+" has been changing to :"+stock.getStockFligtTime());
		
	}

}
