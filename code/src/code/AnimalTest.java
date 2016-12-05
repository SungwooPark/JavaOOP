package code;

public class AnimalTest {

	public static void main(String[] args) {
		Fetcher f= new Dog();
		System.out.println(f.fetch("tennis ball"));
		
		//fetch method is undefined for Cat class
		//Cat c = new Cat();
		//System.out.pritnln(c.fetch("tennis ball"));
	}
}
