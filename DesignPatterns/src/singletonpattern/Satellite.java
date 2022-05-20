package singletonpattern;

public class Satellite {
	
	private Satellite() {
		//to locked built any object outside this class, only inside this class.
	}

	//Reference(not object) variable from the class
	private static Satellite _instance;
	
	public static Satellite getSatellite() {
		if(_instance==null) {
			_instance=new Satellite();
		}
		return _instance;
	}

}
