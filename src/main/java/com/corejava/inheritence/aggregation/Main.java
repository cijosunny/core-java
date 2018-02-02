package com.corejava.inheritence.aggregation;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(new Engine());
		car.start();
	}

}
