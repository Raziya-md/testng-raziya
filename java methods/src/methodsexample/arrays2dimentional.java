package methodsexample;

public class arrays2dimentional {

	public static void main(String[] args) {
int c[][] = {{10, 20, 30}, {40, 50, 60}};
        
          System.out.println(c[1][0]);  // Output will be 40
          System.out.println(c[1][1]);  // Output will be 50
          System.out.println(c.length);   //2
          
          
          int A[][] =new int[2][2];
          A[0][0]=60;
          A[0][1]=80;
          A[1][0]=30;
          A[1][1]=50;
          System.out.println(A[1][0]);  //30
          System.out.println(A[0][0]);    //60
          
        
          // Creating a 1x1 matrix (2D array)
          int[][] matrix1 = new int[1][1]; // 1 row and 1 column

          // Assigning a value to the 1x1 matrix
          matrix1[0][0] = 5;

          // Printing the matrix
          System.out.println("1x1 Matrix1:");
          System.out.println(matrix1[0][0]);  //5
          
          
          
       // Declaring and initializing a 2D array
          int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

          // Accessing and printing elements of the 2D array
          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix[i].length; j++) {
                  System.out.print(matrix[i][j] + " ");
              }
              System.out.println(); // Move to the next line after each row
          }
          
          
          
          
          
          
        	  } 
	}


