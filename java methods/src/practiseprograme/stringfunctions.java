package practiseprograme;

public class stringfunctions {

	public static void main(String[] args) {
		String name="raziya sulthana";
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf("s"));
		System.out.println(name.substring(5,10));//a,t
		String add=" ";
		System.out.println(add.isEmpty());
		System.out.println(name.replace("raziya","amrutha"));
		String sub = " raziya sulthana   ";
		System.out.println(sub.trim());
		String div= "Hyderabad";
		String mul= "Secundrabad";
		System.out.println(div. equals(mul));//false
		String name1= "Hyderabad";
		String name2= "hyderabad";
		System.out.println(name1.equalsIgnoreCase(name2));   //true
		
		String pink="raziyasulthana.mba@gmail.com";
		String splitValues[]=pink.split("a");
		System.out.println(splitValues[5]);//@gm
		
		String animal= "dog is domestic animal";
		String brid= "parrot beak is red in colour";
		System.out.println(animal.concat(brid));
		
		/*for(int d=0;d<animal.length();d++) {
			System.out.print(animal.charAt(d));
		}*/
		for (int d=animal.length()-1;d>=0;d--) {
			System.out.println(animal.charAt(d));
		}
	
	String number="12345";
	for (int i=0;i<number.length();i++){
	System.out.print(number.charAt(i));
	}
	for (int i=number.length()-1;i>=0;i--){	
		System.out.print(" "+number.charAt(i));
	}
}
}