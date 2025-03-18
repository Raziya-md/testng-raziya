package methodsexample;

public class nestedswitchpractice {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5, operation = 5;

	    // Using nested if-else statement
		if (num1 >num2) {
			if (operation == 1) {
				System.out.println("Addition: " + (num1 + num2));
			}else if (operation == 2) {
				System.out.println("subraction: " + (num1 - num2));
			}else if (operation == 3) {
				System.out.println("Multiplication: " + (num1 * num2));
			}else if (operation == 4) {
				System.out.println("division: " + (num1 / num2));
			}
			else if (operation == 5) {
				System.out.println("module: " + (num2 % num1));
			}
				else {
				System.out.println("invalid operation");
			}
		}else {
			System.out.println("num1 is  not greater than num2");
		}
		
		
		switch (operation ) {
        case 1:
            System.out.println("Addition result using switch: " + (num1 + num2));
            break;
        case 2:
            System.out.println("Subtraction result using switch: " + (num1 - num2));
            break;
        default:
            System.out.println("Invalid operation in switch");
            break;
    }
	}

}
