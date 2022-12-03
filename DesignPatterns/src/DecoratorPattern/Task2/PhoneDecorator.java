package DecoratorPattern.Task2;

public abstract class PhoneDecorator implements PhonesPackages {

	private PhonesPackages phonesPackages;

	public PhoneDecorator(PhonesPackages phonesPackages) {
		this.phonesPackages = phonesPackages;
	}

	public PhonesPackages getPhonesPackages() {
		return phonesPackages;
	}

}
