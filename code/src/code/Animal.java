package code;

abstract public class Animal {
	int size;
	String breed;
	String name;
	
	public Animal() {
		System.out.println("Running no-arg Animal constructor");
		size = 10;
		breed = "Generic Animal";
		name = "Annie";
	}
	
	public Animal(int size, String breed, String name){
		System.out.println("Running animal constructor");
		this.size = size;
		this.breed = breed;
		this.name = name;
	}
	
	public void bark() {
		
	}
	
	public abstract void makeNoise();
	
	public void setSize(int s){
		size = s;
	}
	
	public int getSize(){
		return size;
	}

	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @param a
	 * @return whether an animal that this method is invoked on is bigger
	 * than the animal passed as an argument
	 */
	public boolean isBigger(Animal a){
		return this.getSize() >= a.getSize();
	}
}