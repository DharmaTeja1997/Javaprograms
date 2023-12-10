package com.collectionss.generics;

public class Addition {
	static<T extends Number,D extends Number> void add(T num1, D num2) {
		System.out.println(num1.doubleValue()+num2.doubleValue());
		
	}

}
