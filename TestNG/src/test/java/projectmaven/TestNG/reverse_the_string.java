package projectmaven.TestNG;

public class reverse_the_string {

	public static void main(String[] args) {
		
          String input = "Welcome to india";
        
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Reverse the first word ("Welcome")
        StringBuilder reversedFirstWord = new StringBuilder(words[0]);
        reversedFirstWord.reverse();
        
        // Combine the reversed first word with the rest of the sentence
        String result = reversedFirstWord.toString()+ " " + words[1] + " " + words[2] ;
        
        // Output the result
        System.out.println(result);
	

    
    // Reverse the last word ("india")
    StringBuilder reversedlastWord = new StringBuilder(words[2]);
    reversedlastWord.reverse();
    
    // Combine the reversed first word with the rest of the sentence
    //String results = words[0] + " " + words[1] +" "+ reversedlastWord.toString() ;
    
    // Output the result
    System.out.println(words[0] + " " + words[1] +" "+ reversedlastWord.toString());	
	
    
    /* StringBuilder reversedfirstWord = new StringBuilder(words[0]);
    StringBuilder reversedmiddleWord = new StringBuilder(words[1]);
    StringBuilder reversedfinalWord = new StringBuilder(words[2]);
    reversedfirstWord.reverse();
    reversedmiddleWord.reverse();
    reversedfinalWord.reverse(); */
    
    StringBuilder sent = new StringBuilder(input);
    System.out.println(sent.reverse());
        
    // Output the result
   // System.out.println(reversedfirstWord+" "+ reversedmiddleWord+" "+reversedfinalWord);	
	
}
}
