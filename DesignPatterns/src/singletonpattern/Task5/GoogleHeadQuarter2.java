package singletonpattern.Task5;

public class GoogleHeadQuarter2 {

	private static GoogleHeadQuarter2[] _instances = new GoogleHeadQuarter2[3];

	static int addnext = 0;

	private GoogleHeadQuarter2() {

	}

	public static synchronized GoogleHeadQuarter2 getGoogle() {
		for (int i = 0; i < _instances.length; i++) {
			if (_instances[i] == null) {
				_instances[i] = new GoogleHeadQuarter2();
				return _instances[i];
			}
		}

		if (_instances.length == addnext) {
			addnext = 0;
		}
		return _instances[addnext++];
	}

}
