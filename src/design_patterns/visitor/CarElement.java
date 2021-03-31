package design_patterns.visitor;

public interface CarElement {
	void accept(CarElementVisitor visitor);
}
