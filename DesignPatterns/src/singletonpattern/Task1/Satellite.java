package singletonpattern.Task1;

public class Satellite {

	private Satellite() {
		// to locked built any object outside this class, only inside this class.
	}

	// Reference(not object) variable from the class
	private static Satellite _instance;

	public static Satellite getSatellite() {
		// Disadvantage: synchronized make few delay when there a whole of objects
		// one way: put it in the function like this : public static synchronized
		// Satellite getSatellite()
		synchronized (Satellite.class) { // second way: to ensure didn't do both object in same time

			if (_instance == null) {
				_instance = new Satellite();
			}
			return _instance;
		}
	}

}
