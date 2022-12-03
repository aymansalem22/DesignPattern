package ObserverPattern.Task2;

import java.text.SimpleDateFormat;

public class DisplayBoard implements Observer {

	@Override
	public void update(Stock stock) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss");
		System.out.println("DisplayBoard--> The : " + stock.getNameAirLines() + " with number flight: "
				+ stock.getStockFlightNumber() + " that has destination : " + stock.getStockFlyingDestination()
				+ " has been changing to :" + sdf.format(stock.getStockFligtTime()));

	}

}
