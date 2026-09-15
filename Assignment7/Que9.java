abstract class Shape {
	abstract void draw();
}

class ShapeFactory {
	public void createShape() {
		Shape circle = new Shape() {
			@Override
			void draw() {
				System.out.println("Drawing a Circle using an Anonymous Inner class.");
			}
		};
		circle.draw();
	}
}

public class Que9 {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		factory.createShape();
	}
}