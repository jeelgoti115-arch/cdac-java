class Box {
    private double length;
    private double breadth;

    public Box() {
        this.length = 0;
        this.breadth = 0;
    }

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setVal(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}

class Box3d extends Box {
    private double height;

    public Box3d() {
        super();
        this.height = 0;
    }

    public Box3d(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public void setVal(double length, double breadth, double height) {
        super.setVal(length, breadth);
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * (getLength() * getBreadth() + getBreadth() * height + height * getLength());
    }

    public double volume() {
        return getLength() * getBreadth() * height;
    }

    public double getHeight() {
        return height;
    }
}

public class Que1 {
    public static void main(String[] args) {
        Box b1 = new Box(10.0, 5.0);
        System.out.println("2D Box (b1)");
        System.out.println("Length: " + b1.getLength() + ", Breadth: " + b1.getBreadth());
        System.out.println("Area: " + b1.area());

        Box3d b2 = new Box3d(10.0, 5.0, 4.0);
        System.out.println("\n3D Box (b2)");
        System.out.println("Length: " + b2.getLength() + ", Breadth: " + b2.getBreadth() + ", Height: " + b2.getHeight());
        System.out.println("Surface Area: " + b2.area());
        System.out.println("Volume: " + b2.volume());

        System.out.println("\nUpdating 3D Box (b2) using setVal");
        b2.setVal(6.0, 4.0, 2.5);
        System.out.println("Updated Length: " + b2.getLength() + ", Breadth: " + b2.getBreadth() + ", Height: " + b2.getHeight());
        System.out.println("Updated Surface Area: " + b2.area());
        System.out.println("Updated Volume: " + b2.volume());
    }
}