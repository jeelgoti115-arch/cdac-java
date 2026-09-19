class Person {
	protected String name;
	protected int age;

	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void getData() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Employee extends Person {
	private int empId;
	private double salary;

	public void setData(String name, int age, int empId, double salary) {
		super.setData(name, age);
		this.empId = empId;
		this.salary = salary;
	}

	@Override
	public void getData() {
		super.getData();
		System.out.println("Employee ID: " + empId);
		System.out.println("Salary: $" + salary);
	}
}

	public class Que2 {
		public static void main(String[] args) {
			System.out.println("Base Class Reference & Object");
			Person p = new Person();
			p.setData("Jeel", 22);
			p.getData();

			System.out.println("\nDerived Class Object (Demonstrating Overloading & Overriding)");
			Employee emp = new Employee();
			emp.setData("Shivam", 26, 121, 75000.0);
			emp.getData();

			System.out.println("\nDynamic Method Dispatch (Runtime Polymorphism)");
			Person ref = new Employee();
			ref.setData("Mit", 21);
			ref.getData();
		}
	}