public class AnimalTest {

	public static void main(String[] args) {
		AnimalPack animals = new AnimalPack();
		animals.addAnimal(0, new Cat(5,"Maine Coon","Cathy"));
		animals.addAnimal(1, new Dog(10,"Corgi","Max"));
		animals.addAnimal(2, new Dog(1,"Tiny Corgi","Maxine"));
		
		animals.sortBySize();
		System.out.println(animals.getAnimal(0).getName());
		System.out.println(animals.getAnimal(1).getName());
		System.out.println(animals.getAnimal(2).getName());
		
		animals.sortByBreed();
		System.out.println(animals.getAnimal(0).getName());
		System.out.println(animals.getAnimal(1).getName());
		System.out.println(animals.getAnimal(2).getName());
	}
}