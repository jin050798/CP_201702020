import java.util.Scanner;
public class project2 {

	public static void main(String[] args) {
		double C; 	//C=�����µ�
		double F;	//F=ȭ���µ�
		Scanner input = new Scanner(System.in);
		System.out.print("ȭ���µ��� �Է��Ͻÿ� : ");
		F = input.nextDouble();
		C = (5.0/9.0)*(F-32.0);
		
		System.out.println((int)F+"ȭ���µ���"+C+"�����µ��Դϴ�.");
		// TODO Auto-generated method stub

	}

}
