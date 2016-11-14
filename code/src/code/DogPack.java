package code;

import java.util.ArrayList;

public class DogPack {
private ArrayList<Dog> dogs;
	
	/**
	 * Initialize dogs variable to be an ArrayList of Dog instances.
	 * And then initialize a Dog instance for each index.
	 * @param size the size of the dogs list
	 */
	public void makeArray(int size){
		dogs = new ArrayList<Dog>();
		for (int i=0;i<size;i++){
			dogs.add(new Dog());
		}
	}
	
	/**
	 * Add a given dog instance to the dogs list at specified index
	 * @param index  An index to add a dog instance
	 * @param d      A dog instance to add
	 */
	public void addDog(int index, Dog d){
		dogs.add(index,d);
		//Adding a dog, not replacing
	}
	
	/**
	 * 
	 * @return a dog instance with biggest size
	 */
	public Dog biggestDog(){
		Dog biggestDog = dogs.get(0);
		for (int i=1;i<dogs.size();i++){
			if (dogs.get(i).isBigger(biggestDog)){
				biggestDog = dogs.get(i);
			}
		}
		return biggestDog;
	}
}
