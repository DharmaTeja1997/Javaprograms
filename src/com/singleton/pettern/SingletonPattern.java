package com.singleton.pettern;

public class SingletonPattern {
	private static SingletonPattern singleton;

	/**
	 * create a private construtor
	 */
	private SingletonPattern() {

	}

	/**
	 * create a static method to get instance
	 */
	public static SingletonPattern getInstance() {
		if (singleton == null) {
			synchronized (SingletonPattern.class) {

				singleton = new SingletonPattern();
			}
		}
		return singleton;

	}

	public void displayMassage() {
		System.out.println("I have called using singleton object");
	}

}
