package com.corejava.inheritence.aggregation;

public class Car {
	private String name;
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void start(){
		engine.start();
		System.out.println("Car Started");
	}
}
