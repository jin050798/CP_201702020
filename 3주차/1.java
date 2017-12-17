import java.util.Scanner;

public class project_3 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		a = scan.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = scan.nextInt();
		System.out.print("정수를 입력하시오: ");
		c = scan.nextInt();
		System.out.print("정렬된 숫자");
		
		if(a>b) {
			if(b>c) {
				System.out.println(c+" " + b + " " + a);
			}
			else {
				if(a>c) {
					System.out.println(b + " " + c + " " + a);
				}
				else {
					System.out.println(b + " " + a + " " + c);
				}
			}
		}
		else {
			if(a>c) {
				System.out.println(c + " " + a + " " + b);
			}
			else {
				if(b>c) {
					System.out.println(a + " " + c + " "+ b);
				}
				else {
					System.out.println(a + " " + b + " " +c);
				}
			}
		}
	}

}
