import java.util.Scanner;
public class project4 {

	public static void main(String[] args) {
		
		double radius;	// ���� ������
		double height;	// ����� ����
		double volume;	// ������� ����
		Scanner input = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		radius = input.nextDouble();;
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		height = input.nextDouble();
		volume = 3.141592*radius*radius*height;
		
		System.out.println("������� ���Ǵ�"+volume+"�Դϴ�.");
		// TODO Auto-generated method stub

	}

}
