package FactoryPattern.Task3;

public class LaptopFactory {

	public static Laptop createLaptop(String type) {
		switch (type) {
		case Laptop.ACERFORGAMES:
			return new Acer("I5", 4, 256, 15.6, true);

		case Laptop.ACERFORDESIGNERS:
			return new Acer("I7", 8, 1000, 15.6, false);

		case Laptop.ASUS:
			return new Asus("I9", 16, 500, false, true);

		case Laptop.DELL:
			return new Dell("I3", 12, "SSD", true);

		case Laptop.LENOVO:
			return new Lenovo("I7", "DDR4", "HDD", "FHD");

		default:
			return null;
		}

	}

}
