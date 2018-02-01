package com.corejava.string;

public class LearnString {
public static void main(String[] args) {
	String a = "a";
	String b = "a";
	System.out.println(a==b);
	
	String c = new String("b");
	String d = "b";
	System.out.println(c==d);
	
	String e = new String("c");
	String f = new String("c");
	System.out.println(e==f);
	
	String g = new String("a");
	System.out.println(a==g);
	String h = g.intern();
	System.out.println(a==g);
	System.out.println(a==h);
}
}
