package com.corejava.inheritence;

public class Main {
	private String str;
	private static String staticStr;
	
	public static void main(String[] args) {
		Child child = new Child();
		Main main =  new Main();
	}
	
	static{
		System.out.println("Main.java Static Block");
	}
	
	{
		System.out.println("Main.java Non static block");
		this.staticStr = str;
	}

}
