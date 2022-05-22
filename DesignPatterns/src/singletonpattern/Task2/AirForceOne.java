package singletonpattern.Task2;

public class AirForceOne {
	
	private static AirForceOne _instance;
	
	private AirForceOne() {
		
	}
	
	public void fly() {
		System.out.println("Aiforce one is flying...");
	}
	
	public static AirForceOne getInstance() {
		if(_instance==null) {
			_instance=new AirForceOne();
		}
		return _instance;
	}
	

}
