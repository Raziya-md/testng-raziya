package methodsexample;

public class twodarray {

	public static void main(String[] args) {
		int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        int[][] matrix2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };
	        
	        // Resultant matrix for addition
	        int[][] sub = new int[3][3];
	        
	        // Adding corresponding elements of the matrices
	        for (int i = 0; i < matrix1.length; i++) {
	            for (int j = 0; j < matrix1[i].length; j++) {
	                sub[i][j] = matrix1[i][j] - matrix2[i][j];
	            }
	        }
	        
	        // Printing the result
	        System.out.println("Sub of the matrices:");
	        for (int i = 0; i < sub.length; i++) {
	            for (int j = 0; j < sub[i].length; j++) {
	                System.out.print(sub[i][j] + " ");
	            }
	            System.out.println();
	        }

	        
	        
	   /*     int[][] matrix1 = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	            };
	            int[][] matrix2 = {
	                {9, 8, 7},
	                {6, 5, 4},
	                {3, 2, 1}
	            };
	            
	            // Resultant matrix for addition
	            int[][] sum = new int[3][3];
	            
	            // Adding corresponding elements of the matrices
	            for (int i = 0; i < matrix1.length; i++) {
	                for (int j = 0; j < matrix1[i].length; j++) {
	                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
	                }
	            }
	            
	            // Printing the result
	            System.out.println("Sum of the matrices:");
	            for (int i = 0; i < sum.length; i++) {
	                for (int j = 0; j < sum[i].length; j++) {
	                    System.out.print(sum[i][j] + " ");
	                }
	                System.out.println();
	            }  */
	}

}
