public class Students1 {
	private int rollno;
	private String name;
	private int age;

	public void setData(int rollno,String name,int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public void getData(){
		System.out.println(rollno+" "+name+" "+age);
	}

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		String b=args[1];
		int c=Integer.parseInt(args[2]);
		Students1 s1=new Students1();
		Students1 s2=new Students1();
		s1.setData(1, "Shivam" ,50);
		s1.getData();
		s2.setData(a,b,c);
		s2.getData();
	}
}
