package _2_BridgePattern.withoutPattern;

import _2_BridgePattern.withoutPattern.shape.*;

public class NoBridgePattern {

	public static void main(String args[]) {

		Circle circle = new BlueCircle();

		Square square = new RedSquare();
		
		Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();
	}

}
