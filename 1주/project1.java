import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		
		double mile;
		double km;
		Scanner in = new Scanner(System.in);
		System.out.print("마일을 입력하시요: ");
		mile = in.nextDouble();
		km= 1.609 * mile;
		
		System.out.println((int)mile+"마일은"+km+"킬로미터입니다.");
		// TODO Auto-generated method stub

	}

}
