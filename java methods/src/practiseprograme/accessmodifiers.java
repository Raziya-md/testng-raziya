package practiseprograme;

public class accessmodifiers {

	public void access() {  //public entire project level can use
		int w=10;
		byte s=20;
		System.out.println(w/s);
			}
	private void sub() {    //private can use only in this class
		short g=30;
		long f= 50;
		System.out.println(g%f);
	}
	void div() {    //default can use in entire package
		float h=50.67f;
		double j= 20.5;
		System.out.println(h-j);
	}
	protected void add() {  //projected can access within the package 
		int y=60;
		byte b=70;
		System.out.println(y+b);
		
	}
	
	public static void main(String[] args) {
		accessmodifiers obj2=new accessmodifiers();
		obj2.add();
		obj2.access();
		obj2.div();
		obj2.sub();

	}

}
