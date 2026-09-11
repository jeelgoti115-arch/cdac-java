class Address{
	String street;
	String city;
	String state;
	public void SetAddress(String street, String city, String state){
		this.street=street;
		this.city=city;
		this.state=state;
	}
	public String GetAddress(){
		return street + ", " + city + ", " + state;
	}
}

class Person{
	String name;
	Address address;
	public void SetPerson(String name, Address address){
		this.name = name; 
		this.address = address;
	} 
	public void GetPerson(){
		System.out.println("Name: " + name); 
		System.out.println("Address: " + address.GetAddress()); }
}

class Student{
	private String name;
	private int age;
	private double CGPA;
	public void SetStudent(String name, int age, double CGPA){
		this.name = name;
		this.age = age;
		this.CGPA = CGPA;
	}
	public String GetStudent(){
		return "Student's name is: "+ name + "\nStudent's age is: " + age +"\nStudent's CGPA is: "+ CGPA; 
	}
}

public class Code9 {
	public static void main(String[] args) {
		Address a1 = new Address();
		a1.SetAddress("Katargam", "Surat", "Gujrat");
		Person p1 = new Person();
		p1.SetPerson("Jeel", a1);
		p1.GetPerson();
		Student s1 = new Student();
		s1.SetStudent("Shivam", 28, 8.9);
		System.out.println(s1.GetStudent());
	}
}
