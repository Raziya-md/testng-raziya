package projectmaven.TestNG;

public class character_digitseperation {

	public static void main(String[] args) {
		 // Input string
        String input = "ddr344Hhg876";
        
        // Strings to store letters and numbers
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        
        // Iterate through the input string
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If character is a digit, append it to numbers
                numbers.append(ch);
            } else {
                // If character is not a digit, append it to letters
                letters.append(ch);
            }
        }
        
        // Print the results
        System.out.println("a= " + letters);
        System.out.println("b= " + numbers);
    }


	}


