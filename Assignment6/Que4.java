class Person {
	protected String name;
	protected int age;

	public Person() {
		System.out.println("1. Person (Base Class) default constructor invoked.");
		this.name = "Unknown";
		this.age = 0;
	}

	public Person(String name, int age) {
		System.out.println("1. Person (Base Class) parameterized constructor invoked.");
		this.name = name;
		this.age = age;
	}

	public void displayPerson() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

class Employee extends Person {
	private int empId;
	private double salary;

	public Employee() {
		super();
		System.out.println("2. Employee (Derived Class) default constructor invoked.");
		this.empId = 0;
		this.salary = 0.0;
	}

	public Employee(String name, int age, int empId, double salary) {
		super(name, age); 
		System.out.println("2. Employee (Derived Class) parameterized constructor invoked.");
		this.empId = empId;
		this.salary = salary;
	}

	public void displayEmployee() {
		displayPerson();
		System.out.println("Employee ID: " + empId + ", Salary: $" + salary);
	}
}

public class Que4 {
	public static void main(String[] args) {
		System.out.println("Creating Person Object");
		Person p = new Person("Jeel", 28);
		p.displayPerson();

		System.out.println("\nCreating Employee Object (Default Constructor)");
		Employee emp1 = new Employee();
		emp1.displayEmployee();

		System.out.println("\nCreating Employee Object (Parameterized Constructor)");
		Employee emp2 = new Employee("Shivam", 32, 121, 757878.0);
		emp2.displayEmployee();
	}
}