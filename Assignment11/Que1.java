import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [ID: " + id + ", Name: " + name + ", Grade: " + grade + "]";
    }
}

public class Que1 {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Alice", "A"));
        students.add(new Student(102, "Bob", "B+"));
        students.add(new Student(103, "Charlie", "A-"));
        students.add(new Student(104, "Diana", "O"));
        students.add(new Student(105, "Ethan", "B"));

        System.out.println("Traversing Student List :");
        for (Student s : students) {
            System.out.println("ID: " + s.getId() + " | Name: " + s.getName() + " | Grade: " + s.getGrade());
        }

        System.out.println("\nTraversing using toString() :");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}