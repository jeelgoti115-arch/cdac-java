class Sphere {
	public static void main(String[] args){
		int radius = Integer.parseInt(args[0]);
		double v = (4/3)*Math.PI*radius*radius*radius;
		System.out.println("volume of Sphere = "+v);
	}
}