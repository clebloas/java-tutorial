package fr.clebloas.javatutorial;

public final class AppleBag {
	Apple apple;

	public void add(Apple apple){
		this.apple = apple;

	}

	public Apple take(){
		return apple;
	}
}
