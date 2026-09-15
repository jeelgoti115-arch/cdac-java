import java.util.*;

abstract class Shape {
	abstract double area();
}

class Circle extends Shape {
	double radius;
	Circle(double radius) {
	this.radius = radius;
	}
	@Override
	double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	double len;
	double width;
	Rectangle(double len, double width) {
		this.len = len;
		this.width = width;
	}
	@Override
		double area() {
		return len * width;
	}
}

public class Que1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Circle Radius:");
		double radius = sc.nextDouble();
		Circle c1 = new Circle(radius);
		System.out.println("Area of the Circle :" + c1.area());

		System.out.print("Rectangle length :");
		double length = sc.nextDouble();
		System.out.print("Rectangle Width :");
		double width = sc.nextDouble();
		Rectangle r1 = new Rectangle(length, width);
		System.out.println("Area of Rectangle: " + r1.area());
	}
}