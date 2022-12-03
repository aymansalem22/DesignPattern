package DecoratorPattern.Task2;

public class LineFiber extends PhoneDecorator {

	public LineFiber(PhonesPackages phonesPackages) {
		super(phonesPackages);
	}

	@Override
	public void show(int phonePackage) {
		if (phonePackage == 3) {
			System.out.println("You have fiber Line");
		} else {
			this.getPhonesPackages().show(phonePackage);
		}

	}

	@Override
	public int subscriptionPrice() {
		return this.getPhonesPackages().subscriptionPrice() + 20;
	}

	@Override
	public String getSubscription() {
		return subscriptionPrice() + " " + CURRENCY;
	}

}
