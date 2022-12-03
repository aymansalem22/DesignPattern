package DecoratorPattern.Task1;

public class Discovery extends channelDecorator {

	public Discovery(SatelliteTV saltelliteTV) {
		super(saltelliteTV);
	}

	@Override
	public void show(int channelNumber) {
		if (channelNumber > 200 && channelNumber < 300) {
			System.out.println("Enjoy the Documentary");
		} else {
			this.getSatelliteTV().show(channelNumber);
		}

	}

	@Override
	public int subscriptionPrice() {

		return this.getSatelliteTV().subscriptionPrice() + 10;
	}

}
