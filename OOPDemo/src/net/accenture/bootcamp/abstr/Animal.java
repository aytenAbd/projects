package net.accenture.bootcamp.abstr;

public abstract class Animal {
	
	 int size;
	 int weight;
	 String bioType;
	
	//abstract methods
	public abstract void eat();
	public abstract void makeNoise();
	
	//non abstract method
    public void sleep(){
    	System.out.println("sleeping...");
    }
    
   public static void main(String... args) {

   } 

}

