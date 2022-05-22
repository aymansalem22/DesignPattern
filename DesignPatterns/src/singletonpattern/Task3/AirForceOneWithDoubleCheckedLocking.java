package singletonpattern.Task3;

public class AirForceOneWithDoubleCheckedLocking {

	private volatile static AirForceOneWithDoubleCheckedLocking _instance;
	
	private AirForceOneWithDoubleCheckedLocking() {
		
	}
	
	public void fly() {
		System.out.println("Airforce one is flying");
	}
	
	public static synchronized AirForceOneWithDoubleCheckedLocking getInstance() {
		synchronized (AirForceOneWithDoubleCheckedLocking.class) {
			
		
		if(_instance==null) {
			_instance=new AirForceOneWithDoubleCheckedLocking();
		}
		
	}
		return _instance;
	}
	
	
}
