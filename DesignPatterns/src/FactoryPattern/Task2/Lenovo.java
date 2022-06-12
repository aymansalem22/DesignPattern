package FactoryPattern.Task2;

public class Lenovo implements Laptop {
	private String cpu;
	private int ramType;
	private DiskType typeHardDisk;
	private String screenQuality;

	public Lenovo(String cpu, int ramType, DiskType typeHardDisk, String screenQuality) {
		this.cpu = cpu;
		this.ramType = ramType;
		this.typeHardDisk = typeHardDisk;
		this.screenQuality = screenQuality;

	}

	@Override
	public void showspecs() {

		System.out.println("type is :" + this.getClass().getSimpleName() + " \nCpu= " + cpu + "\nramType= " + ramType
				+ "\ntypeHardDisk: " + typeHardDisk + "\nscreenQuality=  " + screenQuality);

	}

}
