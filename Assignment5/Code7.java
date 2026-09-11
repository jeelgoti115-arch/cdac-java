class Rectangle{
	int length;
	int width;
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	public double area(){
		return length*width;
	} 
	public double perimeter(){
		return 2*(length+width);
	}
}
public class Code7 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20);
		System.out.println("The area of reactangle is: "+r.area());
		System.out.println("The perimeter of reactangle is: "+r.perimeter());
	}
}