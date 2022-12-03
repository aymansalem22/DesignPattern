package FactoryPattern.Task3;

public class Dell implements Laptop {

	private String cpu;
	private int ramsize;
	private String typeHardDisk;
	private boolean hasOS;

	public Dell(String cpu, int ramsize, String typeHardDisk, boolean hasOS) {
		this.cpu = cpu;
		this.ramsize = ramsize;
		this.typeHardDisk = typeHardDisk;
		this.hasOS = hasOS;
	}

	@Override
	public void showspeces() {
		System.out.println("type is:" + this.getClass().getSimpleName() + "\ncpu:" + this.cpu + "\nramsize:"
				+ this.ramsize + "\ntypeharddisk:" + this.typeHardDisk + "\nhasos:" + this.hasOS);

	}

}
