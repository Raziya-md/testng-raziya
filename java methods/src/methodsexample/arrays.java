package methodsexample;

public class arrays {

	public static void main(String[] args) {
		
		/*int A[] =new int[3];
              A[0]=10;
              A[1]=20;
              A[2]=30;
              //A[3]=40;
             //  System.out.println(A[3]);  //exception index out of bound
              System.out.println(A[2]); //30
              System.out.println(A[1]);  //20
              
              int B;
              for(B=0;B<=2;B++) {
            	  System.out.println(A[B]);
            	  } 
              int h;
              for(h=0;h<=2;h++) {
            	  System.out.println(A[h]);
              }
              int k=0;
              while(k<=2) {
            	  System.out.println(A[k]);
            	  k++;
              }
              int l=0;
              do {
            	  System.out.println(A[l]);  
              }
              while(l<=2);*/
              
            /*  int n[]= {10,20,30,40,50,60,70,80};
              System.out.println(n[5]);
              System.out.println(n.length);
              
              int v;
              for(v=0;v<=4;v++) {
            	  System.out.println(n[v]);
              }
              char ovals[]= {'a','e','i','o','u'};
              int o;
              for(o=0;o<=4;o++) {
            	  System.out.print(ovals[o]);
              }
              System.out.println(" ");
              double d[]= {12.5,22.5,44.7,88.5};
              byte y;
              for(y=0;y<=2;y++) {
            	  System.out.println(d[y]);
              }*/
              
             /* int[] arr;
         	 arr =  new int[5];
         	 arr[0] = 10;
         	 arr[1] = 20;
         	 arr[2] = 30;
         	 arr[3] = 40;
         	 arr[4] = 50;
         	 for (int i=0; i<arr.length;i++) {
         	 System.out.println("Element at index" +i+ "is" +arr[i]);
              }
         	 
         	  // Declare and initialize an array
         	        int[] numbers = {10, 20, 30, 40, 50};
                      byte i=0;
         	        // Use a for loop to iterate through the array
         	        while ( i < numbers.length) {
         	            System.out.println("Element at index " + i + ": " + numbers[i]);
         	        i++;
         	        }  */
		
		float  z[]=new float[5];
		z[0]=10;
		z[1]=20;
		z[2]=30;
		z[3]=50;
		z[4]=70;
		System.out.println(z[4]); //indicate the index no.
		
		int k[]= {10,200,500,700,600};
		int b;
		for(b=0;b<k.length;b++) {
			System.out.println(k[b]);
			//System.out.println(k.length);
		}
		byte h=0;
		while(h<=4) {
			System.out.println(k[h]);
			h++;
		}
         	 
	short g=0;
	do {
		System.out.println(k[g]);
		g++;
	}while(g>=4);
	}
        	}


