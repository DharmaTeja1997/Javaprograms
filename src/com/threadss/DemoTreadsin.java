package com.threadss;

public class DemoTreadsin extends Thread{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		
		for(int i=1; i<=20; i++) {
			System.out.println(name+":"+i);
		}
	}
	public static void main(String[] args) {
		DemoTreadsin dm=new DemoTreadsin();
		dm.start();
		String name=Thread.currentThread().getName();
		for(int i=1; i<=20; i++) {
			System.out.println(name+":"+i);
		}
	}
	

}
