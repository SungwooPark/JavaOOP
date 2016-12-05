package code;

public class Dog extends Animal implements Fetcher{
	
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
	
	public String fetch(String s){
		return "damp " + s;
	}
}
