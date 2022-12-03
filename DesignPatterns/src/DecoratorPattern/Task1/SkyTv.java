package DecoratorPattern.Task1;

public class SkyTv implements SatelliteTV {

	@Override
	public void show(int channelNumber) {
		if(channelNumber<100) {
			System.out.println("Basic news channel");
		}else {
			System.out.println("You are not subscribed");
		}

	}

	@Override
	public int subscriptionPrice() {
		return 100;
	}

}
