package DecoratorPattern.Task2;

public class LineOnDemandChannels extends PhoneDecorator {

	public LineOnDemandChannels(PhonesPackages phonesPackages) {
		super(phonesPackages);
	}

	@Override
	public void show(int phonePackage) {
		if (phonePackage == 4) {
			System.out.println("You have package Demand channels");
		} else {
			this.getPhonesPackages().show(phonePackage);
		}

	}

	@Override
	public int subscriptionPrice() {

		return this.getPhonesPackages().subscriptionPrice() + 30;
	}

	@Override
	public String getSubscription() {

		return subscriptionPrice() + " " + CURRENCY;
	}

}
