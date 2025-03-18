package practiseprograme;

public class arrays {

	public static void main(String[] args) {
		int A[]= new int [4];
		A[0]=20;
		A[1]=30;
		A[2]=50;
		A[3]=60;
		System.out.println(A[2]);

		int x;
		for (x=0;x<=3;x++) {
			System.out.println(A[x]);
		}
		
		int S[][]=new int [4][4];
		S[0][0]=20;
		S[0][1]=30;
		S[0][2]=40;
		S[0][3]=50;
		S[1][0]=70;
		S[1][1]=80;
		S[1][2]=90;
		S[1][3]=100;
		S[2][3]=110;
		S[3][3]=10;
		System.out.println(S[1][1]);
		System.out.println(S[2][3]);
		System.out.println(S[3][3]);
				
	}

}
