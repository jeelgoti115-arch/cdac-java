interface Shape {
	void draw();
	void calculateArea();
}

interface Colourful extends Shape {
	void fillcolor();
}

class Circle implements Colourful {
	int r;
	Circle(int r) {
		this.r = r;
	}
	@Override
	public void fillcolor() {
		System.out.println("Fill the color");
	}
	@Override
	public void draw() {
		System.out.println("draw the circle of the given radius.");
	}
	@Override
	public void calculateArea() {
		System.out.println("Area of the Circle: " + Math.PI * r * r);
	}
}

public class Que6 {
	public static void main(String[] args) {
		System.out.println("Implement Shape from Circle :");
		Circle c1 = new Circle(5);
		c1.draw();
		c1.calculateArea();
		
		System.out.println();

		System.out.println("Implement Colourful from Circle :");
		c1.draw();
		c1.calculateArea();
		c1.fillcolor();
	}
}