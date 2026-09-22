import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    private int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade + "]";
    }
}

class StudentManager {
    private Set<Student> students = new LinkedHashSet<>();

    public boolean addStudent(Student student) {
        boolean added = students.add(student);
        if (added) {
            System.out.println("Added: " + student.getName() + " (Roll No: " + student.getRollNumber() + ")");
        } else {
            System.out.println("Duplicate Roll No detected! Could not add: " + student.getRollNumber());
        }
        return added;
    }

    public boolean removeStudent(int rollNumber) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getRollNumber() == rollNumber) {
                iterator.remove();
                System.out.println("Successfully removed student with Roll No: " + rollNumber);
                return true;
            }
        }
        System.out.println("Student with Roll No " + rollNumber + " not found.");
        return false;
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found in the record.");
            return;
        }

        System.out.println("\n--- Student Records (Preserving Insertion Order) ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

public class Que7 {
	public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(103, "Charlie", "A"));
        manager.addStudent(new Student(101, "Alice", "B+"));
        manager.addStudent(new Student(105, "Ethan", "A-"));
        manager.addStudent(new Student(102, "Bob", "B"));

        manager.addStudent(new Student(101, "Alice Duplicate", "O"));

        manager.displayStudents();

        System.out.println("\n--- Removing Student with Roll No 101 ---");
        manager.removeStudent(101);

        manager.displayStudents();
    }
}