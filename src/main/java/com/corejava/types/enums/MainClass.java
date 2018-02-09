package com.corejava.types.enums;

import com.corejava.types.enums.MainClass.CoffeeType;

public class MainClass {
	/*
	 * 
	 * */
	
	enum CoffeeType {
		COLD, HOT;
	};
	
	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		String val = mainClass.returnEnumVal(CoffeeSize.BIG);
		System.out.println(val);
		System.out.println(MealType.BREAKFAST);
		
		Coffee morningCoffee = new Coffee(MealType.BREAKFAST, CoffeeSize.HUGE, CoffeeType.HOT);
		Coffee eveningCoffee = new Coffee(MealType.DINNER, CoffeeSize.BIG, CoffeeType.COLD);
		System.out.println(morningCoffee);
		System.out.println(eveningCoffee);
		
		for (MealType type : MealType.values()) {
			System.out.println(type.name());
		}
	}
	
	public String returnEnumVal(CoffeeSize coffeesize){
		return coffeesize.name();
	}
}
class Coffee{
	private String mealType;
	private String coffeeSize;
	private String coffeeType;
	
	public Coffee(MealType mealType, CoffeeSize coffeeSize, CoffeeType coffeeType) {
		this.mealType = mealType.name();
		this.coffeeSize = coffeeSize.name();
		this.coffeeType = coffeeType.name();
	}

	@Override
	public String toString() {
		return "Coffee [mealType=" + mealType + ", coffeeSize=" + coffeeSize + ", coffeeType=" + coffeeType + "]";
	}
	
	
}
enum MealType {
	BREAKFAST, LUNCH, DINNER
};