package com.corejava.loops;

public class LabelledLoops {
	public static void main(String[] args) {
		outer:
			for (int i = 0; i < 10; i++) {
				inner:
					for (int j = 0; j < 10; j++) {
						if(j==5){
							continue outer;
						}
						if(j==2){
							break inner;
						}
						System.out.print(j);
					}
				System.out.println(i);
			}
		System.out.println("Loop Ended");
	}
}
