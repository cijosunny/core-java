package com.corejava.thread.methodtwo;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Running thread "+Thread.currentThread().getName()+" "+i);
		}
	}

}
