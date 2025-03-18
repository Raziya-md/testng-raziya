package methodsexample;

public class loopsprogramming {

	public static void main(String[] args) {
		/*int n = 5;  //// The height of the pyramid
		/// Outer loop for the number of rows (levels of the pyramid)
		for(int i = 1; i <= n; i++) {
			//// Inner loop to print spaces
			for (int j = i; j < n; j++) {
				System.out.print(" "); //print spaces
			}
			// Inner loop to print stars
				for (int k = 1;k <= (2 * i - 1); k++) {
					System.out.print("*");  //print spaces
				}
				// Move to the next line after each row
				System.out.println();
				}
			}

}*/

       char b[]= {'R','A','Z','I','Y','A'};
       int x;
       for(x=0;x<b.length;x++) {
    	   System.out.print(b[x]);
       }
       
       int w;
       for(w=0;w<=5;w++) {
    	   System.out.println(w);
       }
       
       float f;
       for (f=2;f<=10;f++) {
    	   System.out.println(f);
       }
       
       short p=10;
       while(p<=15) {
    	   System.out.println(p);
    	    p++;    
    	    }   
      double n=1;
       do {
    	   System.out.println(n);
    	   n++;
       }while(n>=10);
       
       
       
	}
}

