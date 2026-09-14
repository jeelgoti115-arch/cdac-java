class Person {
	protected String name;
	protected int age;

	public void setPersonData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayPersonData() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Employee extends Person {
	protected int empId;
	protected double salary;

	public void setEmployeeData(String name, int age, int empId, double salary) {
		setPersonData(name, age);
		this.empId = empId;
		this.salary = salary;
	}

	public void displayEmployeeData() {
		displayPersonData();
		System.out.println("Employee ID: " + empId);
		System.out.println("Salary: $" + salary);
	}
}

class Manager extends Employee {
	private String department;

	public void setManagerData(String name, int age, int empId, double salary, String department) {
		setEmployeeData(name, age, empId, salary);
		this.department = department;
	}

	public void displayManagerData() {
		displayEmployeeData();
		System.out.println("Department: " + department);
	}
}

public class Que3 {
	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.setManagerData("Jeel Goti", 22, 1111, 99999.0, "Ai");
		System.out.println("Employee Details");
		mgr.displayManagerData();
	}
}