package inheritance;

public class classB extends classA{
    void age() {
    	int person1=35;
    	int person2=44;
    	System.out.println(person1);
    }
	public static void main(String[] args) {
		classA obj3=new classA();
		obj3.add(15, 8, (byte)10);
		classB obj4=new classB();
		obj4.age();
	}

}
