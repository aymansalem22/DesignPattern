package singletonpattern.Task2;

public class Client {

	public static void main(String[] args) {
		AirForceOne airForceOne = AirForceOne.getInstance();
		airForceOne.fly();
	}

}
