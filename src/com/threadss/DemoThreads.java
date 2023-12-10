package com.threadss;

public class DemoThreads extends Thread {
	@Override
	public void run() {
		System.out.println("run");
		Thread mainthread = Thread.currentThread();
		System.out.println(mainthread.getPriority());
		System.out.println(mainthread.getName());
		System.out.println(mainthread.getState());
		System.out.println(mainthread.isDaemon());
	}

	public static void main(String[] args) {

		DemoThreads d = new DemoThreads();
		d.setName("Thread in  main");
		d.setPriority(d.MAX_PRIORITY);
		d.setDaemon(true);
		d.start();

	}

}
