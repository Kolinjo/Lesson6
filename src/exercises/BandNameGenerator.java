package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	

	public static void main(String[] args) {
		
		ArrayList<String>adjectives = new ArrayList<String>();
		adjectives.add("happy");
		adjectives.add("joyfully");
		adjectives.add("cheerfull");
		adjectives.add("slender");
		adjectives.add("wonderful");
		adjectives.add("mystic");
		
		
		ArrayList<String>nouns = new ArrayList<String>();
		nouns.add("people");
		nouns.add("children");
		nouns.add("boys");
		nouns.add("girls");
		nouns.add("world");
		nouns.add("universe");
		
		for (int i = 0; i < 5; i++) {
			
			int x = new Random().nextInt(adjectives.size());
			int y = new Random().nextInt(nouns.size());
			
			System.out.println(adjectives.get(x)+ " " + nouns.get(y));
			
		}
		
		
	}
		

}









