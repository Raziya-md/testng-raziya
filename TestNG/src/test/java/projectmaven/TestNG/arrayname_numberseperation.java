package projectmaven.TestNG;

import java.util.ArrayList;
import java.util.List;

public class arrayname_numberseperation {

	public static void main(String[] args) {
		 // Input array
        String[] input = { "Apple", " 12344", " Banana", " 45666", "Orange", " 9876" };
        
        // Lists to store numbers and names
        List<Integer> numbers = new ArrayList<>();
        List<String> names = new ArrayList<>();
        
         // Iterate through the input array
        for (String item : input) {
            // Trim leading and trailing whitespaces
            item = item.trim();
        
        
            // Check if the item is a number
            try {
                // If it can be parsed as an integer, it's a number
                numbers.add(Integer.parseInt(item));
            } catch (NumberFormatException e) {
                // If parsing fails, it's a name
                names.add(item);
            } 
        }

        // Print the results
        System.out.println("Numbers: " + numbers);
        System.out.println("Names: " + names);
    }

	}


