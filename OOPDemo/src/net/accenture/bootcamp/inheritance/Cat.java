package net.accenture.bootcamp.inheritance;

public class Cat extends Mammal{
	
	public String furColor;
	public boolean isPet;

	
	public static void main(String... args ){
		Cat cat = new Cat();
		cat.makeNoise();
		cat.furColor = "grey";
	}
	
/*	@Override
	public void makeNoise(){
		System.out.println("mau");
	}*/
}
