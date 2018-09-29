package DesignPattern.BridgePattern;

public class Shape2Bridge {

	public static void main(String[] args) {
		Color blue = new Blue();
		Color red = new Red();
		
		Square square = new Square(blue);
		
		Circle circle = new Circle(red);
		
		square.applyColor();
		circle.applyColor();

	}

}
