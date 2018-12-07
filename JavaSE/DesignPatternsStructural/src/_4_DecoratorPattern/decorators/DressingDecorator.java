package _4_DecoratorPattern.decorators;

import _4_DecoratorPattern.entities.Sandwich;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addDressing();
	}
	
	private String addDressing() {
		return " + mustard";
	}
	
}
