package DecoratorPattern.Task2;

public class LineAdsl extends PhoneDecorator {

	public LineAdsl(PhonesPackages phonesPackages) {
		super(phonesPackages);
	}

	@Override
	public void show(int phonePackage) {
		if (phonePackage == 2) {
			System.out.println("You have adsl line!");
		} else {
			this.getPhonesPackages().show(phonePackage);
		}

	}

	@Override
	public int subscriptionPrice() {
		return this.getPhonesPackages().subscriptionPrice() + 10;
	}

	@Override
	public String getSubscription() {
		return subscriptionPrice() + " " + CURRENCY;
	}

}
