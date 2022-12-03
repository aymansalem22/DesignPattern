/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern.Task1;

public class SingletonPattern {

	// usage: when need to create only one object per class.

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Satellite s1 = Satellite.getSatellite();
				System.out.println(s1.hashCode());

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Satellite s2 = Satellite.getSatellite();
				System.out.println(s2.hashCode());
			}
		});

		t1.start();
		t2.start();

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				Satellite2 s3 = Satellite2.getStellite2();
				System.out.println(s3.hashCode());

			}
		});

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				Satellite2 s4 = Satellite2.getStellite2();
				System.out.println(s4.hashCode());

			}
		});

		t3.start();
		t4.start();
	}

}
