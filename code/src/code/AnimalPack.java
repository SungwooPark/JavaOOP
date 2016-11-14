package code;

import java.util.ArrayList;

public class AnimalPack {
private ArrayList<Animal> animals;
	
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
}
