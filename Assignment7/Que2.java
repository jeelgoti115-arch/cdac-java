abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog sounds Bow..Bow");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat sounds Meow..Meow");
	}
}

class Cow extends Animal {
	@Override
	void sound() {
		System.out.println("Cow sounds Mauh..Mauh");
	}
}
public class Que2 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.sound();

		Cat c1 = new Cat();
		c1.sound();
		
		Cow cow1 = new Cow();
		cow1.sound();
		
		System.out.println("For Run time Polymorphism: where parent class call objects from child class");
		Animal a1 = new Dog();
		a1.sound();
		
		Animal a2 = new Cat();
		a2.sound();
		
		Animal a3 = new Cow();
		a3.sound();
	}
}