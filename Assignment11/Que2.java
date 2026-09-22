import java.util.ArrayList;
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

public class Que2 {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Alice", 88.5));
        students.add(new Student(102, "Bob", 76.0));
        students.add(new Student(103, "Charlie", 94.5));
        students.add(new Student(104, "Diana", 91.0));
        students.add(new Student(105, "Ethan", 82.5));

        if (students.isEmpty()) {
            System.out.println("The list of students is empty.");
            return;
        }

        Student topStudent = students.get(0);

        for (Student s : students) {
            if (s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }

        System.out.println("--- Student with the Highest Grade ---");
        System.out.println(topStudent);
        System.out.println("Name: " + topStudent.getName() + " | Grade: " + topStudent.getGrade());
    }
}