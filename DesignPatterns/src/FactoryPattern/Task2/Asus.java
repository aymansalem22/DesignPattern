package FactoryPattern.Task2;

public class Asus implements Laptop {

	private String CPU;
	private int ramSize;
	private int hardDiskSize;
	private boolean hasTouchScreen;
	private boolean hasBluetooth;
	
	private Asus(String CPU,int ramSize,int hardDiskSize,boolean hasTouchScreen,boolean isBlutooth) {
		this.CPU=CPU;
		this.ramSize=ramSize;
		this.hardDiskSize=hardDiskSize;
		this.hasTouchScreen=hasTouchScreen;
		this.hasBluetooth=isBlutooth;
	}

	@Override
	public void showspecs() {
		System.out.println("type is: "+this.getClass().getSimpleName()+"\ncpu: "+CPU+" \nramsize: "
		+ramSize+"\nhardDisk: "+hardDiskSize+"\nsizeScreen: "+hasTouchScreen+"\nisBlutooth: "+hasBluetooth);
		
	}
	

}
