package projectmaven.TestNG;

import java.util.HashMap;

public class hashmap_repitationofcharacters {

	public static void main(String[] args) {
		 String inputString = "hello"; // Example string
	        HashMap<Character, Integer> charCount = characterCount(inputString);

	        // Display the character count
	        for (char key : charCount.keySet()) {
	            System.out.println(key + ": " + charCount.get(key));
	        }
	}

	    public static HashMap<Character, Integer> characterCount(String inputString) {
	       HashMap<Character, Integer> charCount = new HashMap<>();

	        // Loop through each character in the string
	        for (char c : inputString.toCharArray()) {
	            // If the character is already in the map, increment the count
	            if (charCount.containsKey(c)) {
	                charCount.put(c, charCount.get(c) + 1);
	            } else {
	                // If it's the first occurrence, set count to 1
	                charCount.put(c, 1);
	            }
	        }
	        return charCount;
	  
	}

}
