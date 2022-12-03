package DecoratorPattern.Task1;

public class CartoonNetwork extends channelDecorator {

	public CartoonNetwork(SatelliteTV satelliteTV) {
		super(satelliteTV);
	}

	@Override
	public void show(int channelNumber) {
		if (channelNumber > 300 && channelNumber < 400) {
			System.out.println("Enjoy Cartoon");
		} else {
			this.getSatelliteTV().show(channelNumber);
		}

	}

	@Override
	public int subscriptionPrice() {
		return this.getSatelliteTV().subscriptionPrice() + 6;
	}

}
