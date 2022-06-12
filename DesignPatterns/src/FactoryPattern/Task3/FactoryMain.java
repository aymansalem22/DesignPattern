package FactoryPattern.Task3;

public class FactoryMain {

	public static void main(String[] args) {
		Laptop[] laptops=new Laptop[5];
		laptops[0]=LaptopFactory.createLaptop(Laptop.ASUS);
		laptops[1]=LaptopFactory.createLaptop(Laptop.ACERFORGAMES);
		laptops[2]=LaptopFactory.createLaptop(Laptop.ACERFORDESIGNERS);
		laptops[3]=LaptopFactory.createLaptop(Laptop.LENOVO);
		laptops[4]=LaptopFactory.createLaptop(Laptop.DELL);

		for (Laptop laptop : laptops) {
			laptop.showspeces();
			System.out.println("---------------");
		}
	}

}
