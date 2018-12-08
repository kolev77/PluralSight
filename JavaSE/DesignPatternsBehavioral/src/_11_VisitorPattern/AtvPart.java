package _11_VisitorPattern;

public interface AtvPart {
	public void accept(AtvPartVisitor visitor);
}
