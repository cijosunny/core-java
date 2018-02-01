package com.corejava.inheritence;

public class Parent {
	static{
		System.out.println("Parent Static Block");
	}
	
	{
		System.out.println("Parent Non static block");
	}

	Parent() {
		System.out.println("Parent");
	}
	
	Parent(String name){
		System.out.println("Parent 2");
	}
}
