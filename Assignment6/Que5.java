class Parent {
	public void printParentMessage() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent {
	public void printChildMessage() {
		System.out.println("This is child class");
	}
}

public class Que5 {
	public static void main(String[] args) {
		Parent parentObj = new Parent();
		Child childObj = new Child();

		System.out.println("1 - Calling method of parent class by object of parent class:");
		parentObj.printParentMessage();

		System.out.println("\n2 - Calling method of child class by object of child class:");
		childObj.printChildMessage();

		System.out.println("\n3 - Calling method of parent class by object of child class:");
		childObj.printParentMessage();
	}
}