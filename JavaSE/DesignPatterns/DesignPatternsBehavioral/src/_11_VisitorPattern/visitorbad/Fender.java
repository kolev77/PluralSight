package _11_VisitorPattern.visitorbad;

public class Fender implements AtvPart {
	@Override
	public double calculateShipping() {
		return 3;
	}
}
