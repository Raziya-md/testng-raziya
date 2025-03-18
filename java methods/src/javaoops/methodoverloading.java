package javaoops;

public class methodoverloading {

	public void add() {   //zero parameter 
		System.out.println("adding  numbers");
	}
	public void add(int A,byte B) { //add variable will not be duplicate because parameters added, adding 2parameters  ,
		System.out.println(A+B);
	}
	public void add(int A,Byte B,int C) {  //add variable will not be duplicate because parameters added, adding 3 parameters
		System.out.println(A+B+C);
	}
	
	public static void main(String[] args) {
		methodoverloading addition=new methodoverloading();
		addition.add();
		addition.add(100, (byte)70);
addition.add(10, (byte)50, 40);
addition.add(50,(byte)100,30);
	}

}
