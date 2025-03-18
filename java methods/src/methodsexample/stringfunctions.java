package methodsexample;

public class stringfunctions {

	public static void main(String[] args) {
		//String name= "     Welcome To this world    ";
/*System.out.println(name.length());
System.out.println("there is space" + (name.charAt(0)));
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.substring(0,11));*/
	//	String chk= " ";
		//System.out.println(chk.isEmpty());  //space also considered false will print
		//System.out.println(chk.isBlank());  //true 
		//replace the character
		/*System.out.println(name.replace("world", "india"));
		System.out.println(name.replace("w", "@"));
		System.out.println(name.replace("k", "@"));  //will print the same 
		System.out.println(name.trim()); //will remove starting and ending spaces only
		*/
		/*String name1 = "Sulthana";
		String name2 = "Sulthana";
		System.out.println(name1.equals(name2));  //true
		System.out.println(name1.equalsIgnoreCase(name2));  //true
		System.out.println(name1.compareTo(name2)); //if both equal than will print 0
		*/
		
		String Transaction = "Raziyasulthana.mba@gmail.com";
		String splitvalues[] = Transaction.split("\\.");
		System.out.println(splitvalues[0]);
		System.out.println(splitvalues[1]);
		System.out.println(splitvalues[2]);
		//System.out.println(splitvalues[3]); //  for dot regular expression we need to take\\.
		
		String DOB="19/03/2013/2014/03";
		String values[]=DOB.split("3");
		
		for (String value : values) {
		    // Check if the substring contains '/'
		    int slashIndex = value.indexOf('/');
		    
		    if (slashIndex != -1) {
		        // If '/' is found, extract the part before and after '/'
		        String beforeSlash = value.substring(0, slashIndex);   // Part before '/'
		        String afterSlash = value.substring(slashIndex + 1);  // Part after '/'
		        
		        // Print both parts with a newline between them
		        System.out.println(beforeSlash);
		        if (!afterSlash.isEmpty()) {
		            System.out.println(afterSlash);
		        }
		    } else if (!value.isEmpty()) {
		        // If there's no '/', just print the value (e.g., "19", "201", "2014")
		        System.out.println(value);
		    }
		}
		        //System.out.println(values[0]);
		//System.out.println(values[1]);
		//System.out.println(values[2]);  //will it consider index until the first split
		//System.out.println(values[3]);
		//System.out.println(values[4]);
		
		//joining multiple strings
		
		/* String name1 = "raziya";
		String name2 = "Sulthana";
				String name3="mohammed";
				System.out.println(name1.concat(name2).concat(name3)+ "From UK");
		
				//forward ORDER
			for(int i=0; i<name1.length();i++) {
					System.out.println(name1.charAt(i));
				}
		//reverse order
		for (int i=name1.length()-1;i>=0; i--) {
			System.out.println(name1.charAt(i));
		}
		
		//print 'a' in Raziya word
		for(int i=0; i<name1.length();i++) {
			char val=name1.charAt(i);
			if (val== 'a') {
			System.out.println(name1.charAt(i));
		}
		
	}
		
			String details ="Raziya sulthana Dornakal";
			String splitval[] = details.split(" ");
			for (int j = 0; j<3;j++) {
				System.out.println(splitval[j]);
			}
			String splitVal[]=details.split(" ");
					for(int j=0;j<3;j++) {
				if (splitVal [j].equals("Dornakal")) {
					System.out.println("yes dornakal exist");
			} 
			else {
				System.out.println("Dornakal not exist");
				}
					
					}
					//contains to check the word exit
					for(int j=0;j<3;j++) {
						if (splitVal [j].contains("Dornakal")) {
							System.out.println("yes dornakal exist");
					} 
					else {
						System.out.println("Dornakal not exist");
						}	
					
					}
					//to check  character is digit or alphabet
					String password="Hello@1234";
					System.out.println(password.charAt(0));
					//System.out.println(Character.isAlphabetic(2));  */
	}}
