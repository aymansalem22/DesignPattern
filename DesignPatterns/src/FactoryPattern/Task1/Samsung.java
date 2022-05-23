package FactoryPattern.Task1;

public class Samsung implements Mobile {

	private int ramSize;
	private String processor;
	
	
	public Samsung(int ramSize) {
		this.ramSize=ramSize;
	}
	
	public Samsung(String processor) {
		this.processor=processor;
		ramSize=2;
	}
	
	@Override
	public void showspecs() {
     System.out.println("type is "+this.getClass().getSimpleName()+""
     		+ " \nRam : "+ramSize+"\nProcessor: "+processor);
	}

}
