package com.corejava.thread.methodone;

public class Main {

	public static void main(String[] args) {
		Thread t = new MyThread();
		t.setName("Sam's");
		t.start();
		
		Thread t1 = new MyThread();
		t1.setName("John's");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("Doe's");
		t2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread "+i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

}
