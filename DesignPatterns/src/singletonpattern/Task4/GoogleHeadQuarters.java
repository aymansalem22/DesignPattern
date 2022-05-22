package singletonpattern.Task4;

public class GoogleHeadQuarters {
	private static GoogleHeadQuarters _instance1;
	private static GoogleHeadQuarters _instance2;
	private static GoogleHeadQuarters _instance3;
	
	private GoogleHeadQuarters() {
		
	}

	public static synchronized GoogleHeadQuarters getGoogle() {
		if(_instance1==null) {
			_instance1=new GoogleHeadQuarters();
			return _instance1;
		}
		if(_instance2==null) {
			_instance2=new GoogleHeadQuarters();
			return _instance2;
		}
		if(_instance3==null) {
			_instance3=new GoogleHeadQuarters();
			return _instance3;
		}
		
		return _instance1;
	}
}
