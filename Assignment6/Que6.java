class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	public void printSalary() {
		System.out.println("Salary: $" + salary);
	}
}

class Employee extends Member {
	String specialization;

	public void displayEmployeeDetails() {
		System.out.println("Employee Details:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
		printSalary();
		System.out.println("Specialization: " + specialization);
	}
}

class Manager extends Member {
	String department;

	public void displayManagerDetails() {
			System.out.println("Manager Details:");
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Phone Number: " + phoneNumber);
			System.out.println("Address: " + address);
			printSalary();
			System.out.println("Department: " + department);
	}
}

public class Que6 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Jeel Goti";
		emp.age = 22;
		emp.phoneNumber = "+91-9999999999";
		emp.address = "123 Madhuranagar, Ameerpet";
		emp.salary = 99999.0;
		emp.specialization = "AI ML Engineer";

		Manager mgr = new Manager();
		mgr.name = "Shivam Patel";
		mgr.age = 22;
		mgr.phoneNumber = "+91-8888888888";
		mgr.address = "123 Madhuranagar, Ameerpet";
		mgr.salary = 88888.0;
		mgr.department = "AI ML Engineer";

		emp.displayEmployeeDetails();
		System.out.println("--------------------------------");
		mgr.displayManagerDetails();
	}
}