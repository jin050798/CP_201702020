import java.util.Scanner;
public class project3 {

	public static void main(String[] args) {
		
		int cm;
		int 피트;
		double 인치;
		Scanner in = new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		cm = in.nextInt();
		피트 = (int)(cm / 2.54) / 12; ;
		인치 = (cm/2.54) %12;
		
		System.out.println((int)cm+"cm는"+피트+"피트"+인치+"인치입니다.");
		
		
		// TODO Auto-generated method stub

	}

}
