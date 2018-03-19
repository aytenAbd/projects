package net.accenture.bootcamp.polymorp;

class Animal {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
}

class Horse extends Animal {
	public void eat() {
		System.out.println("Horse eating hay, oats, and horse treats");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eating whiscas");
	}
}

public class AnimalDemo {

	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal horse = new Horse(); // Animal ref, but a Horse object
		Animal cat = new Cat(); // Animal ref, but a Cat object
		animal.eat(); // Runs the Animal version of eat()
		horse.eat(); // Runs the Horse version of eat()
		cat.eat(); // Runs the Cat version of eat()
	}

}


