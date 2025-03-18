package javaoops;

public class interfaceclass implements animalinterface{

		
	public void domestic() {
		System.out.println("this is domestic animals");
		
	}

	public void wild(){
		System.out.println("this is wild animals");
	}
		public static void main(String[] args) {
		interfaceclass obj=new interfaceclass();
		obj.domestic();
		obj.wild();

		}

}
