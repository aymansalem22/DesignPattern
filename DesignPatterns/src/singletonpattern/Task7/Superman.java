package singletonpattern.Task7;

public enum Superman {

	instance;

	private final String name = "Clark Kent";
	private String residence = "USA";

	public void fly() {
		System.out.println("I am flying....." + this.name + " " + this.residence);
	}
}
