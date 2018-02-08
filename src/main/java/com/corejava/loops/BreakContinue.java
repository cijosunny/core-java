package com.corejava.loops;

public class BreakContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i==5){
				continue;
			}
			if(i==8){
				break;
			}
			//5 will not be printed
			//Numbers from 8 will not be printed
			System.out.print(i);
			
		}
	}
}
