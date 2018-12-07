package _4_DecoratorPattern;

import _4_DecoratorPattern.decorators.DressingDecorator;
import _4_DecoratorPattern.decorators.MeatDecorator;
import _4_DecoratorPattern.entities.Sandwich;
import _4_DecoratorPattern.entities.SimpleSandwich;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		
		System.out.println(sandwich.make());
	}
}
