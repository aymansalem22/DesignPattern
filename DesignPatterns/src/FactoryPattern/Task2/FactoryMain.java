package FactoryPattern.Task2;

public class FactoryMain {

	public static void main(String[] args) {
		Laptop asus=LaptopFactory.createLaptop(Laptop.ASUS);
		Laptop acerGames=LaptopFactory.createLaptop(Laptop.ACERFORGAMES);
		Laptop acerDesign=LaptopFactory.createLaptop(Laptop.ACERFORDESIGNERS);
		Laptop lenovo=LaptopFactory.createLaptop(Laptop.LENOVO);		
		Laptop dell=LaptopFactory.createLaptop(Laptop.DELL);

		asus.showspecs();
		System.out.println("----------------------");
		acerGames.showspecs();
		System.out.println("----------------------");
		acerDesign.showspecs();
		System.out.println("----------------------");
		lenovo.showspecs();
		System.out.println("----------------------");
		dell.showspecs();
		
		
	}

}
