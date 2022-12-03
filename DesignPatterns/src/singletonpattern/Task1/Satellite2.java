package singletonpattern.Task1;

public class Satellite2 {

	private Satellite2() {
		// to locked built any object outside this class, only inside this class.
	}

	private static class SatelliteHelper {// an inner class
		private static Satellite2 _innerInstance = new Satellite2();
	}

	public static Satellite2 getStellite2() {
		return SatelliteHelper._innerInstance;
	}

}
