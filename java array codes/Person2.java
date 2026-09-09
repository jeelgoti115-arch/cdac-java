class Person2 {
	private String name;
	private int age;
	private String country;

	// public void setData(String name,int age,String country) {
	// 		this.name = name;
	// 		this.age = age;
	// 		this.country = country;
	// }

	Person2(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
		return ;
	}

	public void getData() {
			System.out.println(name+ " " +age+ " " +country);
	}

	public static void main(String[] args) {
		Person2 b = new Person2("jeel",12,"Cannada");
		b.getData();
	}
}