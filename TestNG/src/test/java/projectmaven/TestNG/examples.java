package projectmaven.TestNG;

import java.util.Arrays;

public class examples {

	public static void main(String[] args) {
		 int[] arr = {12, 35, 1, 10, 34, 1};
	        findSecondHighestAndSecondSmallest(arr);
	    }

	    public static void findSecondHighestAndSecondSmallest(int[] arr) {
	        if (arr.length < 2) {
	            System.out.println("Array must have at least two elements.");
	            return;
	        }

	        // Sort the array
	        Arrays.sort(arr);

	        // 2nd smallest is at index 1
	        int secondSmallest = arr[2];

	        // 2nd highest is at index arr.length - 2
	        int secondHighest = arr[arr.length - 2];

	        System.out.println("Second smallest: " + secondSmallest);
	        System.out.println("Second highest: " + secondHighest);
	    }
	

	}


