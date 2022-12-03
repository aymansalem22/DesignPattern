package FactoryPattern.Task3;

public class FactoryMain2 {

	public static void main(String[] args) {
		Laptop[] laptops = new Laptop[5000];
		int asusCounter = 2000;
		int acerForGamesCounter = 500;
		int acerForDesignerCounter = 500;
		int lenovoCounter = 800;
		int dellCounter = 1200;

		for (int i = 0; i < laptops.length; i++) {
			if (i < asusCounter) {
				laptops[i] = LaptopFactory.createLaptop(Laptop.ASUS);
			} else if (i < asusCounter + acerForGamesCounter) { // 2000to2500
				laptops[i] = LaptopFactory.createLaptop(Laptop.ACERFORGAMES);
			} else if (i < asusCounter + acerForGamesCounter + acerForDesignerCounter) {
				laptops[i] = LaptopFactory.createLaptop(Laptop.ACERFORDESIGNERS);
			} else if (i < asusCounter + acerForGamesCounter + acerForDesignerCounter + lenovoCounter) {
				laptops[i] = LaptopFactory.createLaptop(Laptop.LENOVO);
			} else {
				laptops[i] = LaptopFactory.createLaptop(Laptop.DELL);
			}
		}

		for (Laptop laptop : laptops) {
			laptop.showspeces();
			System.out.println("------------------");
		}

	}

}
