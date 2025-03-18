package methodsexample;

public class loopstatements {

	public static void main(String[] args) {
	//for loops
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(i);			//1 to 10 numbers
		}
		System.out.println("******");
        int q;
        for(q=10;q>=1;q--) {
        	System.out.println(q);  //back to forward
        }
        System.out.println("******");
        int w;
        for(w=1;w<=10;w+=2) {  //w=w+2
        	System.out.println(w);   //odd numbers
        }
        System.out.println("******");
        int e;
        for(e=2;e<=10;e+=2) {  
        	System.out.println(e);  //even numbers
        }
        System.out.println("******");
        int s;
        for(s=1;s<=10;s++) {
        	if ((s!=5) && (s!=9)){  
        	      System.out.println(s);
        }
        }  
       System.out.println("******");
        int u=1;
        while(u<=10) {
        	System.out.println(u);
        	u++;
        }
        System.out.println("******");
        int d=10;
        while(d>=1) {
        	System.out.println(d);
        	d--;
        }
        System.out.println("******");
        int h=2;
        while(h<=10) {
        	System.out.println(h); //even no.
        	h+=2; 
        }
        System.out.println("******");
        int j=1;
        while(j<=10) {
        	System.out.println(j);  //odd no.
        	j+=2; 
}
	
       // System.out.println("******");
    	byte m=1;
	
     do{
        	System.out.println(m);  
        	m++;
       }
	
       while(m>=10);
       
}
}