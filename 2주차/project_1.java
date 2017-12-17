import java.util.Scanner;
class project_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int e;
		Scanner input=new Scanner(System.in);
		System.out.print("500원의 개수 : ");
		a=input.nextInt();
		System.out.print("100원의 개수 : ");
		b=input.nextInt();
		System.out.print("50원의 개수 : ");
		c=input.nextInt();
		System.out.print("10원의 개수 : ");
		d=input.nextInt();
		e=500*a + 100*b + 50*c + 10*d;
		System.out.println("저금통에 들어있는 돈의 액수 : " + e);
		
	}

}
