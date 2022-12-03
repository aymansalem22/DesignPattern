package DecoratorPattern.Task1;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		SatelliteTV satelliteTV=new Espn(new CartoonNetwork(new SkyTv())); 
		satelliteTV.show(45);
		System.out.println(satelliteTV.subscriptionPrice());

	}

}
