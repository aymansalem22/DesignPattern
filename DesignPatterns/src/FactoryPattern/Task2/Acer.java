package FactoryPattern.Task2;

public class Acer implements Laptop {
	private String CPU;
	private int ramSize;
	private int hardDiskSize;
	private double sizeScreen;
	private boolean hasBluetooth;

	public Acer(String CPU, int ramSize, int hardDiskSize, double sizeScreen, boolean isBlutooth) {
		this.CPU = CPU;
		this.ramSize = ramSize;
		this.hardDiskSize = hardDiskSize;
		this.sizeScreen = sizeScreen;
		this.hasBluetooth = isBlutooth;
	}

	@Override
	public void showspecs() {
		System.out.println("type is: " + this.getClass().getSimpleName() + "\ncpu: " + CPU + " \nramsize: " + ramSize
				+ "\nhardDisk: " + hardDiskSize + "\nsizeScreen: " + sizeScreen + "\nisBlutooth: " + hasBluetooth);

	}

}
