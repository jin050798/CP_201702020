import java.util.Scanner;
public class project3 {

	public static void main(String[] args) {
		
		int cm;
		int ��Ʈ;
		double ��ġ;
		Scanner in = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		cm = in.nextInt();
		��Ʈ = (int)(cm / 2.54) / 12; ;
		��ġ = (cm/2.54) %12;
		
		System.out.println((int)cm+"cm��"+��Ʈ+"��Ʈ"+��ġ+"��ġ�Դϴ�.");
		
		
		// TODO Auto-generated method stub

	}

}
