package _2_BridgePattern.withPattern.shape;

import _2_BridgePattern.withPattern.color.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
