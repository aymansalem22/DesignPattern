package FactoryPattern.Task3;

public class Lenovo implements Laptop {

	private String cpu;
	private String ramType;
	private String typeHardDisk;
	private String screenQuality;

	public Lenovo(String cpu, String ramType, String typeHardDisk, String screenQuality) {
		this.cpu = cpu;
		this.ramType = ramType;
		this.typeHardDisk = typeHardDisk;
		this.screenQuality = screenQuality;
	}

	@Override
	public void showspeces() {
		System.out.println("type is:" + this.getClass().getSimpleName() + "\ncpu:" + this.cpu + "\nramtype:"
				+ this.ramType + "\ntypeHD:" + this.typeHardDisk + "\nscreenQuality:" + this.screenQuality);

	}

}
