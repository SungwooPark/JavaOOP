package code;

public class AnimalTest {

	public static void main(String[] args) {
		AnimalPack animals = new AnimalPack();
		animals.makeArray();
			
		for (int i=0;i<5;i++){
			if (Math.random() < 0.5){
				Dog d = new Dog();
				d.setSize(i);
				animals.addAnimal(i, d);
			}else{
				Cat c = new Cat();
				c.setSize(i);
				animals.addAnimal(i, c);
			}
		}
		
		for (int i=0;i<animals.getSize();i++){
			animals.getAnimal(i).makeNoise();
		}

		System.out.println(animals.biggestAnimal().getName());
	}

}
