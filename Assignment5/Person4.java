public class Person4 {
	private String name;
	private int age;
	private String country;
	Person4(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
		return ;
	}
	public void getData() {
			System.out.println(name+ " " +age+ " " +country);
	}
	public void compare(Person4 p){
		if(this.age>p.age){
			System.out.println(this.name+" is older than "+p.name);
		}else{
			System.out.println(p.name+" is older than "+this.name);
		}
	}
	public static void main(String[] args) {
		Person4 b = new Person4("jeel",12,"Cannada");
		Person4 c = new Person4("Shivam",2,"Pakistan");
		b.getData();
		c.getData();
		b.compare(c);
	}
}
