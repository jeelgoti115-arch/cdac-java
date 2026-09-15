interface Animal {
	void makeSound();
	void eat();
}

class Dog implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog make Sound: bow..bow..");
	}
	@Override
	public void eat() {
		System.out.println("Dog likes to eat Pedigree.");
	}
}

class Cat implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat makes Sound: Meow..Meow...");
	}
	@Override
	public void eat() {
		System.out.println("Cat likes to eat Fish.");
	}
}

public class Que4 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makeSound();
		d1.eat();
		System.out.println();

		Cat c1 = new Cat();
		c1.makeSound();
		c1.eat();
	}
}