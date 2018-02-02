package com.corejava.method.overload;


public class Concept {
	/*Primitive Overloading*/
	static void add(int a, int b){System.out.println("First Normal");}
	static void add(double a,double b){}
	static void add(long a,long b){}
	
	static void add(int a,long b){System.out.println("a method invoked");}  
	static void add(long a,int b){System.out.println("b method invoked");}
	
	/* Overloading on Inherited Class*/
	static void add(Child a,Child b){}
	static void add(Parent a,Parent b){}
	
	static Child add(Child a){return new Child();}
	static Parent add(Parent a){return new Child();}
	
	/*Overloading on Varargs*/
	static void add(int ... a){System.out.println("Varargs");}
	static void add(long ... a){}
	
	public static void main(String[] args) {
//		add(20, 20); //Ambiguity Error
		add(new Child(), new Child());
		add();
	}
}
