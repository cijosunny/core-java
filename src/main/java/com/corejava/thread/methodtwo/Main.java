package com.corejava.thread.methodtwo;

public class Main {

	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		t.setName("John");
		Thread t1 = new Thread(new MyThread());
		t1.setName("Sam");
		Thread t2 = new Thread(new MyThread());
		t2.setName("Dan");
		t.start();
		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Running thread Main");
		}
	}

}
