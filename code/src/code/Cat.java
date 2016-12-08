package code;

public class Cat extends Animal{
	
	public Cat() {
		this(5,"Maine Coon","Kitty");
		System.out.println("Running no-arg Cat constructor");
	}
	
	public Cat(int size, String breed, String name){
		super(size,breed,name);
		System.out.println("Running Cat constructor");
	}
	
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
