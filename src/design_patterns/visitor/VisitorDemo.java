package design_patterns.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.accept(new CarElementPrintVisitor());
	}

}
