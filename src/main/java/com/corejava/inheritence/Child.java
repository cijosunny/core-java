package com.corejava.inheritence;

public class Child extends Parent{
	static{
		System.out.println("Child Static Block");
	}
	
	{
		System.out.println("Child Non static block");
	}

	Child() {
		System.out.println("Child");
	}
	Child(String name) {
		super();
		System.out.println("Child 2");
	}
}
