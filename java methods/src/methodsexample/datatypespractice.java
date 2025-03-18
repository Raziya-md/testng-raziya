package methodsexample;

import java.util.Scanner;

public class datatypespractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double Obtainedscore=0, totalscore=0;
		float percentage;
		
		System.out.println("Please enter you Obtainedscore:");
		Obtainedscore = input.nextDouble();
		System.out.println("Please enter you Totalscore:");
		totalscore = input.nextDouble();
		percentage = (float) ((Obtainedscore*100)/totalscore);
		System.out.println("Your percentage is:" +percentage+ "%");

	}

}
