import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=$" + salary + ", Dept=" + department + "]";
    }
}

class EmployeeTreeSetManager {
    private Set<Employee> employees = new TreeSet<>(
        Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER)
                  .thenComparingInt(Employee::getId)
    );

    public boolean addEmployee(Employee emp) {
        boolean added = employees.add(emp);
        if (added) {
            System.out.println("Added: " + emp.getName());
        } else {
            System.out.println("Duplicate detected! Could not add: " + emp.getName());
        }
        return added;
    }

    public Employee searchByName(String name) {
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                return emp;
            }
        }
        return null;
    }

    public boolean removeByName(String name) {
        Employee toRemove = searchByName(name);
        if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("Successfully removed employee: " + name);
            return true;
        } else {
            System.out.println("Employee '" + name + "' not found to remove.");
            return false;
        }
    }

    public void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("The set is empty.");
            return;
        }
        System.out.println("\n--- Current Employees (Sorted by Name) ---");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

public class Que6 {
	public static void main(String[] args) {
        EmployeeTreeSetManager manager = new EmployeeTreeSetManager();

        manager.addEmployee(new Employee(101, "Diana", 75000, "Marketing"));
        manager.addEmployee(new Employee(102, "Bob", 62000, "Finance"));
        manager.addEmployee(new Employee(103, "Alice", 85000, "IT"));
        manager.addEmployee(new Employee(104, "Charlie", 58000, "HR"));

        manager.displayAll();

        System.out.println("\n--- Searching for 'Bob' ---");
        Employee found = manager.searchByName("Bob");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Not found.");
        }

        System.out.println("\n--- Removing 'Diana' ---");
        manager.removeByName("Diana");
        manager.displayAll();
    }
}