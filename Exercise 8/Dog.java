public class Dog extends Animal implements Fetcher{
	
	public Dog(){
		this(10,"Corgi","Max");
	}
	
	public Dog(int size, String breed, String name){
		super(size,breed,name);
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