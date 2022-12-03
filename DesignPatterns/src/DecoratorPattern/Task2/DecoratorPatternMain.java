package DecoratorPattern.Task2;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		/*
		 * 1. phone calls 2. line adsl 3. line fiber 4. channel on demand
		 */

		PhonesPackages p1 = new LinePhone();
		p1.show(1);
		System.out.println("Your subscription Price: " + p1.getSubscription());

		System.out.println("---------------------");

		PhonesPackages p2 = new LineAdsl(new LineFiber(new LineOnDemandChannels(new LinePhone())));

		p2.show(4);
		System.out.println("Your subscription Price: " + p2.getSubscription());
	}

}
