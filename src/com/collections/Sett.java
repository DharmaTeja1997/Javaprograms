package com.collections;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sett {
	public int  m1() {
		System.out.println("m1");
		return 1;
	}
	public static void main1(String[] args) {
		Set set = new HashSet();

		set.add("Java");
		//set.add("Java");
		set.add(null);
		set.add(null);
		
		set.add("Python");
		set.add("JavaScript");
		
		Set s=new HashSet<>();
		s.addAll(set);
		s.add("s.teja");
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main2(String[] args) {
		Set<String> set=new HashSet<>();
		set.addAll(Arrays.asList("apple","banana","mango","goa"));
		
		System.out.println(set);
		
		set.remove("apple");
		System.out.println(set);
		
		set.removeAll(Arrays.asList("banana","goa"));
		System.out.println(set);
		
		set.removeIf(fruit->fruit.startsWith("m"));
		System.out.println(set);
	}
	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<>();
		set.add("dharma");
		set.add("srinivas");
		set.add("naresh");
		set.add("surendra");
		set.add("suppi");

	}

}
