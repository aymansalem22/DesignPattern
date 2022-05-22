package singletonpattern.Task7;

public class Main {

	public static void main(String[] args) {
		Superman superman = Superman.instance;
		Superman superman2 = Superman.instance;

		superman.fly();
		superman2.fly();

		System.out.println(superman.hashCode());
		System.out.println(superman2.hashCode());

	}

}


