package com.corejava.exceptions;

public class CatchThrowable {
	public static void main(String[] args) {
		CatchThrowable ct = new CatchThrowable();
		try {
			ct.throwException();
//			ct.throwRunTimeException();
//			ct.throwError();
			ct.throwThrowable();
		} 
		catch (RuntimeException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		catch (Error e) {
			e.printStackTrace();
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void throwException() throws Exception {throw new Exception();}
	public void throwRunTimeException(){throw new RuntimeException();}
	public void throwError(){throw new OutOfMemoryError();}
	public void throwThrowable() throws Throwable {throw new Throwable();}
	
}
