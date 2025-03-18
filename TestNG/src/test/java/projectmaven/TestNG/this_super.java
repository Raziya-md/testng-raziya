package projectmaven.TestNG;

public class this_super {
int A=10;
static int B=20;

public void add() {
	this.A=100;
	System.out.println(A);
	this.B=200;
	System.out.println(B);
}
	public static void main(String[] args) {
		this_super obj=new this_super();
		System.out.println(obj.A);
		System.out.println(obj.B);
		obj.add();
		

	}

}
