package FactoryPattern.Task2;

public class Dell implements Laptop {

	private String CPU;
	private int ramSize;
	private int hardDiskSize;
	private DiskType typeHardDisk;
	private boolean hasOperationSystem;
	
	public Dell(String CPU,int ramSize,int hardDiskSize,DiskType typeHardDisk,boolean isBlutooth) {
		this.CPU=CPU;
		this.ramSize=ramSize;
		this.hardDiskSize=hardDiskSize;
		this.typeHardDisk=typeHardDisk;
		this.hasOperationSystem=isBlutooth;
	}

	@Override
	public void showspecs() {
		System.out.println("type is: "+this.getClass().getSimpleName()+"\ncpu: "+CPU+" \nramsize: "
		+ramSize+"\nhardDisk: "+hardDiskSize+"\ntypeHardDisk: "+typeHardDisk+"\nhasOperationSystem: "+hasOperationSystem);
		
	}
}
