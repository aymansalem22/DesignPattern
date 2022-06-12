package FactoryPattern.Task3;

public class Asus implements Laptop{
	
	private String cpu;
	private int ramSize;
	private int sizeHardDisk;
	private boolean isTouchScreen;
	private boolean hasBluetooth;
	
	

	public Asus(String cpu, int ramSize, int sizeHardDisk, boolean isTouchScreen, boolean hasBluetooth) {
		this.cpu = cpu;
		this.ramSize = ramSize;
		this.sizeHardDisk = sizeHardDisk;
		this.isTouchScreen = isTouchScreen;
		this.hasBluetooth = hasBluetooth;
	}



	@Override
	public void showspeces() {
    System.out.println("type is:"+this.getClass().getSimpleName()+"\ncpu"+this.cpu+"\nramsize:"+this.ramSize+"\nharddisk:"+this.sizeHardDisk 
    		+"\nistouchscreen:"+this.isTouchScreen+"\nhasbloutooth:"+this.hasBluetooth);
    
    

		
	}

}
