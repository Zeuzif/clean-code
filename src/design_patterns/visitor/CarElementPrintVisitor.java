package design_patterns.visitor;

public class CarElementPrintVisitor implements CarElementVisitor {

	@Override
	public void visit(Body body) {
		System.out.println("This is the body");
	}

	@Override
	public void visit(Car car) {
		System.out.println("This is the car");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("This is the engine");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("This is the " + wheel.getName() + " wheel");
	}
}
