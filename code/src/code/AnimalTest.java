package code;

public class AnimalTest {

	public static void main(String[] args) {
		AnimalPack animals = new AnimalPack();
		animals.addAnimal(0, new Cat());
		animals.addAnimal(1, new Dog());
		animals.addAnimal(2, new Dog());
		
		System.out.println(animals.geoMean());
		System.out.println(AnimalPack.geoMean(animals));
	}
}