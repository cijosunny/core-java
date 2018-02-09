package com.corejava.types.enums;

public enum CoffeeSize {
	BIG("a",8),HUGE("b", 10),OVERWHELMING("c", 16),
	BIGD("a"),HUGED("b"),OVERWHELMINGD("c");

	CoffeeSize(String name, int ordinal) {
	}
	
	CoffeeSize(String name) {
	}
}
