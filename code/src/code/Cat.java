package code;

public class Cat extends Animal{
	
	String name = "Cat";
	
	public void bark(){
		System.out.println("I'm a cat.");
	}
	
	public void makeNoise(){
		System.out.println("Meow");
	}
	
	public String getName(){
		return name;
	}
	
}
