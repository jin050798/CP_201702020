import java.util.Scanner;
public class project_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ű�� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int Ű;
		int ������;
		Ű=scan.nextInt();
		System.out.println("�����Ը� �Է��Ͻÿ� : ");
		������=scan.nextInt();
		double ���;
		���=(Ű-100)*0.9;
		
		if(������>���*1.1)
			System.out.println("��ü��");
		else if(������<���*0.9)
			System.out.println("��ü��");
		else
			System.out.println("ǥ��ü��");

	}

}
