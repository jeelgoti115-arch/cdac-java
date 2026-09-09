public class Person3 {
	private String name;
	private int age;
	private String country;

	// public void setData(String name,int age,String country) {
	// 		this.name = name;
	// 		this.age = age;
	// 		this.country = country;
	// }

	Person3(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}

	Person3(String name,int age){
		this.name = name;
		this.age = age;
		this.country = "India";
	}

	public void getData() {
			System.out.println(name+ " " +age+ " " +country);
	}

	public static void main(String[] args) {
		Person3 b = new Person3("jeel",12,"Cannada");
		b.getData();
	}
}
