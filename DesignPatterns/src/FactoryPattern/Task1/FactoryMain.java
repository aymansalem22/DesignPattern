package FactoryPattern.Task1;

public class FactoryMain {
//test
	public static void main(String[] args) {
		Mobile mobile1 = MobileFactory.createMobile(Mobile.IPHONE11);
		Mobile mobile2 = MobileFactory.createMobile(Mobile.IPHONE12);
		Mobile mobile3 = MobileFactory.createMobile(Mobile.Sony);
		Mobile mobile4 = MobileFactory.createMobile(Mobile.SAMSUNG);

		mobile1.showspecs();
		System.out.println("==========================");
		mobile2.showspecs();
		System.out.println("==========================");
		mobile3.showspecs();
		System.out.println("==========================");
		mobile4.showspecs();

	}

}
