package DecoratorPattern.Task1;

public class Espn extends channelDecorator {

	public Espn(SatelliteTV satelliteTV) {
		super(satelliteTV);
	}

	@Override
	public void show(int channelNumber) {
		if (channelNumber > 100 && channelNumber < 200) {
			System.out.println("Enjoy Football Match");
		}

		else {
			this.getSatelliteTV().show(channelNumber);
		}

	}

	@Override
	public int subscriptionPrice() {
		return this.getSatelliteTV().subscriptionPrice() + 7;
	}

}
