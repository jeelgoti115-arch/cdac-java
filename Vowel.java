class Vowel{
	public static void main(String[] args){
		char n = args[0].charAt(0);

		if(n=='a' ||  n=='A' ||  n=='e' ||  n=='E' ||  n=='i' ||  n=='I' ||  n=='o' ||  n=='O' ||  n=='u' ||  n=='U'){
		System.out.println("Given alphabet is Vowel");
		}
		else{
			System.out.println("Given alphabet is Consonant");
		}
	}
}