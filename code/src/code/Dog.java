package code;

public class Dog extends Animal{
	
	String name = "Dog";
	
	public void bark() {
		System.out.println("Ruff! Ruff!");
	}
	
	public void makeNoise(){
		System.out.println("Bark!");
	}
	
	public String getName(){
		return name;
	}
}
