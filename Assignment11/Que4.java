import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && 
               Objects.equals(name, employee.name) && 
               Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }

    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Department: " + department + "]";
    }
}

public class Que4 {
	public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        employees.add(new Employee(101, "Alice Morgan", "IT"));
        employees.add(new Employee(102, "Bob Smith", "HR"));
        employees.add(new Employee(103, "Charlie Brown", "Finance"));
        employees.add(new Employee(104, "Diana Prince", "Marketing"));
        employees.add(new Employee(105, "Ethan Hunt", "Operations"));

        System.out.println("--- Traversing Employee Set (for-each loop) ---");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId() + " | Name: " + emp.getName() + " | Dept: " + emp.getDepartment());
        }

        System.out.println("\n--- Traversing using toString() ---");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}