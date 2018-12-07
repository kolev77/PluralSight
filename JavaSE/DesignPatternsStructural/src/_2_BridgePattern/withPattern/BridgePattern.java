package _2_BridgePattern.withPattern;

import _2_BridgePattern.withPattern.color.Blue;
import _2_BridgePattern.withPattern.color.Color;
import _2_BridgePattern.withPattern.color.Green;
import _2_BridgePattern.withPattern.color.Red;
import _2_BridgePattern.withPattern.shape.Circle;
import _2_BridgePattern.withPattern.shape.Shape;
import _2_BridgePattern.withPattern.shape.Square;

public class BridgePattern {

	public static void main(String[] args) {
		Color blue = new Blue();
		
		Shape square = new Square(blue);
		
		Color red = new Red();
		
		Shape circle = new Circle(red);
		
		Color green = new Green();
		
		Shape greenCircle = new Circle(green);
		
		Shape greenSquare = new Square(green);
		
		square.applyColor();
		circle.applyColor();
		greenCircle.applyColor();
		greenSquare.applyColor();
	}

}
