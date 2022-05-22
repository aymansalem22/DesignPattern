package singletonpattern.Task3;

import singletonpattern.Task2.AirForceOne;

public class Client {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				AirForceOne airForceOne=AirForceOne.getInstance();
				airForceOne.fly();
				System.out.println(airForceOne.hashCode());
				
			}
		});
		
		
Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				AirForceOne airForceTwo=AirForceOne.getInstance();
				airForceTwo.fly();
				System.out.println(airForceTwo.hashCode());
				
			}
		});
	t1.start();
	t2.start();
	}
}
