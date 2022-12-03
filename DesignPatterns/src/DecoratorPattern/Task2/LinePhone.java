package DecoratorPattern.Task2;

public class LinePhone implements PhonesPackages {

	@Override
	public void show(int phonePackage) {
		if (phonePackage == 1) {
			System.out.println("You have fixed line phone");
		} else {
			System.out.println("You are not subscribed in our services!");
		}

	}

	@Override
	public int subscriptionPrice() {

		return 50;
	}

	@Override
	public String getSubscription() {

		return subscriptionPrice() + " " + CURRENCY;
	}

}
