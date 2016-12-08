package code;

public class Dog extends Animal implements Fetcher{
	
	public Dog(){
		this(10,"Corgi","Max");
		System.out.println("Running no arg Dog constructor");
	}
	
	public Dog(int size, String breed, String name){
		super(size,breed,name);
		System.out.println("Running Dog constructor");
	}
	
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
