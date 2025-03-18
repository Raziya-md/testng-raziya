package practiseprograme;

public class conditional {

	public static void main(String[] args) {
		//if 
		int Q=50;byte e=30;
		long u=2345; float v=245.08f;
		if (Q>e) {
			System.out.println("q is grater");
		}//if else
       if (u<e) {
    	   System.out.println("e is lesser");
       }else {
    	   System.out.println("u is greater");
       } 
       //if else if
       if (e>Q) {
    	   System.out.println("q is greater");
       }
       else if (Q<e) {
    	   System.out.println("q is greater");
       } else if (e<=Q) {
    	   System.out.println("e is lesser");
    	   
    	   
    	   //nested if
    	   if (u>v) {
    		   System.out.println("u is lesser");
    	   }if (u==v) {
    		   System.out.println("v is not equals");
    	   }else {
    		   System.out.println("v is greater");
    	   }
    	   
    	   //switch case
    	   int n=500; 
    	   switch (n) {
    	   case 450:
    		   System.out.println("not equal to given value");
    	   break;
    	   case 300:
    		   System.out.println("not equal to given value 500");
    		   break;
    	   case 500:
    		   System.out.println("equal to given value");
    		   break;
    		   default:
    			   System.out.println("none of the above matches");
    	   }}}}
    		   
       
	


