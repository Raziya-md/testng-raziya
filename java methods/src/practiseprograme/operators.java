package practiseprograme;

public class operators {

	public static void main(String[] args) {
		//arithematic (+,-,*,/,%,++,--)
		int A=20; short B=40;
		System.out.println(A+B);
		int C=20; short D=40;
		System.out.println(D-C);
		double E =20.5;  float F=40.06f;
		System.out.println(E*F);
		long L=23456; byte G=45;
		System.out.println(G/L);
		int H= 4567; byte K=67;
		System.out.println(H%K);
		int Y=3456;
		System.out.println(Y++);
		System.out.println(++Y);
		int Q=3456;
		System.out.println(Q--);
		System.out.println(--Q);
		
		
		
		//Relational(==,!=,<,>,<=,>=)
		int W=20; byte N=80;
		float M=20.7f;double J=85.36;
		long k=2345678763987l; long X= 456789989675342l;
		short o=123; int p=7869;
		System.out.println(W==N);
		System.out.println(W==M);
		System.out.println(k!=X);
		System.out.println(k<=X);
		System.out.println(J>M);
		System.out.println(o<=p);
		System.out.println(N>=p);
		System.out.println(k<o);
		
		//assignment (=,+=,-=,*=)
		
		int n=20; byte j=80;
		float h=20.7f;double s=85.36;
		long z=2345678763987l; long w= 456789989675342l;
		System.out.println(n-=j);
		System.out.println(w+=z);
		System.out.println(n-=h);
		System.out.println(h*=s);
		System.out.println(j*=h);
		
		//logical(!,&&,||)
		int ww=20; short f=40;
		int cc=20; short gg=40;
		System.out.println(ww!=cc);//false
		System.out.println(f>gg  && ww==cc );//false
		System.out.println(ww<gg && f>cc);//true
		System.out.println(cc>f || gg>ww);//true
		
		
	}

}
