
public class Lotto_2 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		
		do
		{
			a =(int)(Math.random()*45+1);
			b=(int)(Math.random()*45+1);
			c=(int)(Math.random()*45+1);
			d=(int)(Math.random()*45+1);
			e=(int)(Math.random()*45+1);
			f=(int)(Math.random()*45+1);
		}
		while(a==b||a==c||a==d||a==e||a==f||b==c||b==d||b==e||b==f||c==d||c==e||c==f||d==e||d==f||e==f);
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+e+" "+f);
			
		}
		// TODO Auto-generated method stub

	}


