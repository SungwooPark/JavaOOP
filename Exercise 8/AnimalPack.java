import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalPack {
	private ArrayList<Animal> animals;
	
	/**
	 * Call makeArray function to initialize the animals instance variable
	 */
	public AnimalPack(){
		makeArray();
	}
	
	public double geoMean(){
		int product = 1;
		for (int i=0;i<animals.size();i++){
			product = product * animals.get(i).getSize();
		}
		return Math.pow(product, 1.0/(animals.size()));
	}
	
	public static double geoMean(AnimalPack a){
		int product = 1;
		for (int i=0;i<a.getSize();i++){
			product = product * a.getAnimal(i).getSize();
		}
		return Math.pow(product, 1.0/(a.getSize()));
	}
	
	/**
	 * Initialize dogs variable to be an ArrayList of Dog instances.
	 * And then initialize a Dog instance for each index.
	 * @param size the size of the dogs list
	 */
	public void makeArray(){
		animals = new ArrayList<Animal>();
	}
	
	/**
	 * Add a given animal instance to the animal list at specified index
	 * @param index  An index to add an animal instance
	 * @param d      An animal instance to add
	 */
	public void addAnimal(int index, Animal a){
		animals.add(index,a);
		//Adding a dog, not replacing
	}
	/**
	 * 
	 * @return the size of animals ArrayList
	 */
	public int getSize(){
		return animals.size();
	}
	
	/**
	 * 
	 * @param index  an index of animal to return
	 * @return an animal in animals ArrayList at the specified index
	 */
	public Animal getAnimal(int index){
		return animals.get(index);
	}
	
	/**
	 * 
	 * @return an animal instance with biggest size
	 */
	public Animal biggestAnimal(){
		Animal biggestAnimal = animals.get(0);
		for (int i=1;i<animals.size();i++){
			if (animals.get(i).isBigger(biggestAnimal)){
				biggestAnimal = animals.get(i);
			}
		}
		return biggestAnimal;
	}
	
	public void sortBySize(){
		Collections.sort(animals);
	}
	
	class BreedCompare implements Comparator<Animal>{
		public int compare(Animal one, Animal two){
			return one.getBreed().compareTo(two.getBreed());
		}
	}
	
	public void sortByBreed(){
		BreedCompare breedCompare = new BreedCompare();
		Collections.sort(animals, breedCompare);
	}
}
