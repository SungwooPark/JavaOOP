abstract public class Animal implements Comparable<Animal>{
	int size;
	String breed;
	String name;
	
	public Animal() {
		size = 10;
		breed = "Generic Animal";
		name = "Annie";
	}
	
	public Animal(int size, String breed, String name){
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
	
	public String getBreed(){
		return breed;
	}
	
	public boolean isBigger(Animal a){
		return this.getSize() >= a.getSize();
	}
	
	public int compareTo(Animal a){
		if (this.size > a.size){
			return 1;
		}else if(this.size == a.size){
			return 0;
		}else{
			return -1;
		}
	}
	
}