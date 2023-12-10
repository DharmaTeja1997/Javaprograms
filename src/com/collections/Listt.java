package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listt extends Throwable{
	public static void main1(String[] args) {
		List list=new ArrayList<>();
		list.add("ram");
		list.add("Dharma");
		list.add("Teja");
		list.add(0,"suppi");
		System.out.println(list);
		
		//its contains means return boolean true r false
		//System.out.println(list.contains("ram"));
		//it returns element in which index
		//System.out.println(list.indexOf("Dharma"));
		//list.remove(1);
		//System.out.println(list.get(2));
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(			iterator.next());
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list);
		}
		for (Object object : list) {
			System.out.println(object);
		}
		

	}
	public static void main(String[] args) {
		List list=new LinkedList<>();
		
		}

}
