/**
 * Huffman histogram code
 */
package net.sung.huffman;

import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author sung
 *
 */
public class Histogram {
	private HashMap<Character, Integer> hist;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Histogram h = new Histogram();
		h.count("Hello World");
		System.out.println(h);
	}
	
	public Histogram(){
		hist = new HashMap<Character, Integer>();
	}
	
	public String toString(){
		Set<Character> characters = hist.keySet();
		String s = "";
		//Sort characters in order
		SortedSet<Character> sortedCharacters = new TreeSet<Character>();
		for (char c : characters){
			sortedCharacters.add(c);
		}
		for (char elem : sortedCharacters){
			s = s + elem + ": " + freq(elem) + " ";
		}
		return s;
	}
	
	public void count(Character c){
		if (hist.containsKey(c)){
			hist.put(c, hist.get(c)+1);
		}else{
			hist.put(c,1);
		}
	}
	
	public void count(String s){
		for (int i=0;i < s.length();i++){
			char c = s.charAt(i);
			count(c);
		}
	}
	
	public int freq(Character c){
		return hist.get(c);
	}
	
	public HashMap<Character, Integer> getHashMap(){
		return hist;
	}
}