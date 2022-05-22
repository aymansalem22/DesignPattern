package singletonpattern.Task6;

public class AppleHeadQuarters {

	private AppleHeadQuarters() {
		
	}
	
	private static class AppleHelper {
		private static AppleHeadQuarters _innerInstance=new AppleHeadQuarters();
	}
	
	public static AppleHeadQuarters getApple() {
		return AppleHelper._innerInstance;
	}
}
