package code;

public class DogTestDrive {

	public static void main(String[] args) {
		int[] sizes = {2,52,4,7};
		AnimalPack dogPack = new AnimalPack();
		
		//dogPack.makeArray(4);
		
		int counter = 0;
		for (int size:sizes){
			Dog tempDog = new Dog();
			tempDog.setSize(size);
			//dogPack.addDog(counter, tempDog);
			counter++;
		}
		
		//System.out.println(dogPack.biggestDog().getSize());

	}

}