package fr.clebloas.javatutorial;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;

public class AppleBagTest {

	@Test
	public void should_take_the_same_apple_we_just_add(){
		// initialisation
		AppleBag bag = new AppleBag();
		Apple apple = new Apple();

		// action
		bag.add(apple);

		// check
		assertEquals(apple, bag.take());
	}

	@Test
	@Ignore
	public void should_add_different_apples(){
		Apple firstApple = new Apple();
		Apple secondApple = new Apple();
		AppleBag bag = new AppleBag();

		bag.add(firstApple);
		bag.add(secondApple);

		// TODO Use assertj to check

	}

}
