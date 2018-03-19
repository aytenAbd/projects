package net.accenture.bootcamp.inheritance;

public class Mammal {
	
	public int size;
	public int weight;
	public String bioType;
	

	
	public void eat(){
		System.out.println("eating something");
	}
	
    public void sleep(){
    	System.out.println("sleeping...");
    }
    
    public void makeNoise(){
    	System.out.println("making some noise");
    }
}
