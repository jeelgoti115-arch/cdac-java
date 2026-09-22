import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
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

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Grade=" + grade + "]";
    }
}

public class Que3 {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Diana", 91.0));
        students.add(new Student(102, "Bob", 76.0));
        students.add(new Student(103, "Ethan", 82.5));
        students.add(new Student(104, "Alice", 88.5));
        students.add(new Student(105, "Charlie", 94.5));

        System.out.println("--- Before Sorting ---");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("\n--- After Sorting by Name (Alphabetical) ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}