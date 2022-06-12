package FactoryPattern.Task2;

public class LaptopFactory {
	
	public static Laptop createLaptop(String type) {
		switch(type) {
		case Laptop.ACERFORGAMES:
			return new Acer("I5",8,500,15.6,true);
		case Laptop.ACERFORDESIGNERS:
			return new Acer("I9", 16, 250, 15.6, false);
			
		case Laptop.ASUS:
			return new Asus("I12", 12, 125, false, true);
	    
		case Laptop.DELL:
			return new Dell("I5", 16, 1000, DiskType.HDD, true);
		
		case Laptop.LENOVO:
			return new Lenovo("I9", 8,DiskType.SDD, "HD");
			
		default:
			return null;
		
		}
		
	}

}
