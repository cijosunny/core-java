package com.corejava.exceptions;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			ExceptionHandling eh = new ExceptionHandling();
			eh.methodOne();
		} finally {
			
		}
	}
	
	public void methodOne(){
		try {
			throw new RuntimeException("Run Time Exception");
		} finally {
			
		}
	}
}
