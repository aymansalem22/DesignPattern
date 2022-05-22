package singletonpattern.Task6;

public class MainApple {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				AppleHeadQuarters ap1=AppleHeadQuarters.getApple();
				System.out.println(ap1.hashCode());
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				AppleHeadQuarters ap2=AppleHeadQuarters.getApple();
				System.out.println(ap2.hashCode());
				
			}
		});
		
		t1.start();
		t2.start();

	}

}
