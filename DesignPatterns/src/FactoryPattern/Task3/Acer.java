package FactoryPattern.Task3;

public class Acer implements Laptop {
	
	private String cpu;
	private int ramSize;
	private int sizeHardDisk;
	private double sizeScreen;
	private boolean Bluetooth;
	
	
	
	

	public Acer(String cpu, int ramSize, int sizeHardDisk, double sizeScreen, boolean bluetooth) {
		this.cpu = cpu;
		this.ramSize = ramSize;
		this.sizeHardDisk = sizeHardDisk;
		this.sizeScreen = sizeScreen;
		Bluetooth = bluetooth;
	}





	@Override
	public void showspeces() {
		System.out.println("type is :"+this.getClass().getSimpleName()+" \ncpu:"+this.cpu+"\nramsize:"+
	this.ramSize+"\nharddisk:"+this.sizeHardDisk+"\nscreen:"+this.sizeScreen+"\nbluetooth:"+this.Bluetooth);
		
	}
	

}
