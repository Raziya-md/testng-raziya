package methodsexample;

public class returnwithmethod {
	
	public int addition(){
		short a=100;
		 int b=20;
		return (a+b);
		}

		public long subraction(){
		long employees= 1000;
		int workers= 150;
		return (employees-workers);
		}

		public boolean greaternumber(){
		short a= 10;
		byte  b= 20;
		return (a>b);  //true/false
		}
		public static boolean height(){
		float b=5.2f;
		float z= 6.2f;
		return (b<z);
		}			//true/false
		
	public static void main(String[] args) {
		returnwithmethod obj= new returnwithmethod();
		System.out.println(obj.addition());
		System.out.println(obj.greaternumber());
		System.out.println(obj.subraction());
		System.out.println(height());
		System.out.println(obj.addition() - obj.subraction());
		System.out.println(obj.addition() + obj.subraction());
		System.out.println(obj.addition() * obj.subraction());
		System.out.println( obj.subraction()  / obj.addition());
		System.out.println(obj.addition() % obj.subraction());
		
	}	
}