package code;

public class Animal {
	private int size;
	String breed;
	String name;
	
	public void bark() {
		
	}
	
	public void makeNoise(){
		System.out.println("Animaaaul!");
	}
	
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