package net.accenture.bootcamp.inheritance;

public class Whale extends Mammal{
	
	String skinColor;
	
	//this behaviour in especial only for fish
	public void swim(){
		System.out.println("swims to northward");
	}
	
	/*	@Override
	public void makeNoise(){
		System.out.println("sing");
	}*/

	
	public static void main(String... args ){
		Whale whale = new Whale();
		whale.makeNoise();
		
	}
}
