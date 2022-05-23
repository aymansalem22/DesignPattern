package FactoryPattern.Task1;

public class Sony implements Mobile {

	private int ramSize;
	private String processor;
	
	public Sony(int ramSize,String processor) {
		this.ramSize=ramSize;
		this.processor=processor;
	}
	
	@Override
	public void showspecs() {
System.out.println("type is : "+this.getClass().getSimpleName()+"\nRam: "+ramSize+" "
		+ "\nprocessor: "+processor);
	}

}
