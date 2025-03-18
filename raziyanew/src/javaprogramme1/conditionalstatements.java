package javaprogramme1;

public class conditionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*   if (true) {
	 System.out.println("yes the condition is true");	 
	 
	 	  }
 int subjectspriority = 60;
 int languagespriority = 10;
 int activitiespriority = 30;
 
 if (subjectspriority>languagespriority) {
	 System.out.println("subject priority is more");
 }
 if (activitiespriority> languagespriority) {
	 System.out.println("activities priority is more");
	  
 }
 if (subjectspriority>activitiespriority) {
	 System.out.println("subject priority is greater than activities");  
		
 }  */
		
		// output print will be true statement only 
	 int soapscost = 30;
	 int pastecost =80;
	 int brushcost = 45;
			 if (soapscost >= brushcost) 
			 {
				 System.out.println("soap is not much costlier");  //false it will not print
				 }
			 else if (pastecost<=brushcost) 
			 {
				 System.out.println("brushcost is cheaper than paste");  //false it will also not print 
			 }
			 else if (pastecost>soapscost) 
			 {
				 System.out.println("pastecost is more than soap");  //true it will give the output 
			 }
			 
			 //biryani cost as per country 
			 
			 int biryani = 10000;
			 
			 if (biryani==100) {
				 System.out.println("it is available in china");  
			 }
			 else if  (biryani== 1000) {
				 System.out.println("it is available in USA");  
			 }
			 else if (biryani==350) {
				 System.out.println("it is available in India");
			 }
			 else if (biryani ==700) {
				 System.out.println("it is available in Australia");
				 }
			 else {
				 System.out.println("none of the above conditions matching here");  // this will print 
			 }
			 
			 //nested if condition
			// here it will print 1st condition output only 
			 
			 byte x= 10;
			 byte y= 12;
			 byte z= 20;
			 
			 if (z>y) {
				 System.out.println("z is greater than all");   //true
			 }
			 else if (x<y) {
				 System.out.println("x is less than y");  //true
			 }
			 
			
			 //nested if both condition true
			 
			 byte xx= 10;
			 byte yy= 12;
			 byte zz= 20;
			 
			 if (zz>yy) {
				 if (xx<yy) {
					 System.out.println("both are true");   //true
					 
				 }
				 
				 int staff = 200;
				 int students = 600;
				 int workers =100;
				 if (students>=staff) {
					 if (workers<=staff) {
						 if (students>workers) {
							 System.out.println("students are more than all");  //this output will display
							 }else  {
								 System.out.println("3rd statement is true");
							 }
					 }else {
						 System.out.println("2nd condition is true");
					 }
				 }else  {
					 System.out.println("1st condition is true");
					  }
				 
				 
				 // next example
				 
				 int staffs = 200;
				 int student = 600;
				 int worker = 100;
				 
				 if (staffs>worker && worker<student && student>staffs && staffs<student) {
					 System.out.println("all are true");
				 }
				 if (staffs<worker || worker!= student || student<=staffs || staffs>student) {
					 System.out.println("1 condition is true");
				 }
				 
				 // switch case
				 
				 int ranks = 4;
				 switch (ranks) {
				 case 1:
					 System.out.println("he got 2nd rank");  
					 break;
				 case 2:
					 System.out.println("he got 3rd rank");  
					 break;
				 case 3:
					 System.out.println("he got 1st rank");  
					 break;
				 case 4:
					 System.out.println("he got 4th rank");  
					 break;
					 default:
						 System.out.println("none of the above");  
						 
					 
				 }
				  
				 }
				 
				 
				 
				 
				 
				 
			 }
				 
				 
				 
			 
			 
		}


