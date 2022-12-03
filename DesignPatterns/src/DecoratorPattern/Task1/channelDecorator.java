package DecoratorPattern.Task1;

public abstract class channelDecorator implements SatelliteTV {

	private SatelliteTV satelliteTV;
	
	public channelDecorator(SatelliteTV satelliteTV) {
		this.satelliteTV=satelliteTV;
	}
	
	public SatelliteTV getSatelliteTV() {
		return satelliteTV;
	}

}
