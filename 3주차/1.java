import java.util.Scanner;

public class project_3 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		a = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		b = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		c = scan.nextInt();
		System.out.print("���ĵ� ����");
		
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
