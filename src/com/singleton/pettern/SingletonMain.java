package com.singleton.pettern;

public class SingletonMain {
	public static void main(String[] args) {
		//Not possible to create an object using new keyword beacause the constructor is private
		//SingletonPattern singleton=new SingletonPattern();
		SingletonPattern singleton=SingletonPattern.getInstance();
		
		singleton.displayMassage();
		singleton.displayMassage();

		
	}

}
