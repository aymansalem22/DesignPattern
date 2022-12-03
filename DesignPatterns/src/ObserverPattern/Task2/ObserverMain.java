package ObserverPattern.Task2;

import java.text.SimpleDateFormat;

public class ObserverMain {

	public static void main(String[] args) {
		RoyalJordanianAir royalJordanAir = new RoyalJordanianAir();
		QatarAirways qatarAirways = new QatarAirways();
		EgyptAir egyptair = new EgyptAir();

		Mobile mobile = new Mobile();
		Desktop desktop = new Desktop();
		DisplayBoard displayBoard = new DisplayBoard();

		royalJordanAir.registerObserver(mobile);
		royalJordanAir.registerObserver(displayBoard);
		royalJordanAir.registerObserver(desktop);

		qatarAirways.registerObserver(mobile);
		qatarAirways.registerObserver(desktop);

		egyptair.registerObserver(displayBoard);
		egyptair.registerObserver(mobile);

		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm MM/dd/yyyy");
		int c = 1;
		for (int i = 0; i < 300; i++) {
			try {
				royalJordanAir.updateStockFlightTime(sdf.parse(c + ":00 " + c + "/5/2021"));
				qatarAirways.updateStockFlightTime(sdf.parse((c + 2) + ":00 " + (c + 1) + "/5/2021"));
				egyptair.updateStockFlightTime(sdf.parse((c + 3) + ":00 " + (c + 2) + "/5/2021"));
				System.out.println("-------------");
				System.out.println("*************");
				if (c == 18) {
					c = 0;
				}
				c++;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
