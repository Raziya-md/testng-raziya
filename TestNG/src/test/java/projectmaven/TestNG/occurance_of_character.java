package projectmaven.TestNG;

import java.util.HashMap;
import java.util.Map;

public class occurance_of_character {

	public static void main(String[] args) {
		String str = "abcabcdabc";
		Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count the frequency of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the occurrence of each character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		    }
		

		
	}


