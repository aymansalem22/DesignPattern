package DecoratorPattern.Task1;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		SatelliteTV satelliteTV = new CartoonNetwork(new Espn(new Discovery(new SkyTv())));
		satelliteTV.show(360);
		System.out.println("Your Subscription Price: " + satelliteTV.subscriptionPrice());

	}

}
