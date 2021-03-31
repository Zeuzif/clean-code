package design_patterns.visitor;

import java.util.List;

public class Car implements CarElement {
	private final List<CarElement> elements;

	public Car() {
		this.elements = List.of(new Wheel("front left"), new Wheel("front right"), new Wheel("back left"),
				new Wheel("back right"), new Body(), new Engine());
	}

	@Override
	public void accept(CarElementVisitor visitor) {
		if(!elements.isEmpty()) {
			for(CarElement element : elements) {
				element.accept(visitor);
			}
			visitor.visit(this);
		}
	}

	public List<CarElement> getElements() {
		return elements;
	}
}
