package com.corejava.inheritence.composition;

public class Car {
	private String name;
	private final Engine engine;
	//Final "Engine" class should be initialized or compilation error
	/*The blank final field engine may not have been initialized*/
	public Car(Engine engine) {
		this.engine = engine;
	}
	
//	public Car(){
//		this.engine = new Engine();
//	}
	
	public void start(){
		engine.start();
		System.out.println("Car Started");
	}
}
