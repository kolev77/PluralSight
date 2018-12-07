package _2_BridgePattern.withPattern.shape;

import _2_BridgePattern.withPattern.color.Color;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
