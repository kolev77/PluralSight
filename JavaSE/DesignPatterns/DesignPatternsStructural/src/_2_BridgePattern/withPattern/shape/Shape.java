package _2_BridgePattern.withPattern.shape;

import _2_BridgePattern.withPattern.color.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
