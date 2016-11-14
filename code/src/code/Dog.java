package code;

public class Dog extends Animal{
	private int size;
	
	void bark() {
		System.out.println("Ruff! Ruff!");
	}
	
	public void setSize(int s){
		size = s;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isBigger(Dog d){
		return this.getSize() > d.getSize();
	}
}
