package com.corejava.thread.methodone;

public class MyThread extends Thread{
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread is "+Thread.currentThread().getName()+" "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

}
