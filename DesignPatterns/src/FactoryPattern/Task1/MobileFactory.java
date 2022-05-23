package FactoryPattern.Task1;

public class MobileFactory {
	
	public static Mobile createMobile(String type) {
		switch(type) {
		case Mobile.IPHONE12:
		return new IPhone(2, "A12", "A12 GPU");
		
		case Mobile.IPHONE11:
			return new IPhone(2, "A11", "A11 GPU");
		
		case Mobile.Sony:
			return new Sony(2, "ATM");
			
		case Mobile.SAMSUNG:
			return new Samsung("Intel");
	    default:
	    	return null;
		
		
		}
	}

}
