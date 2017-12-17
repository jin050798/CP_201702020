import java.util.Scanner;
public class project2 {

	public static void main(String[] args) {
		double C; 	//C=¼·¾¾¿Âµµ
		double F;	//F=È­¾¾¿Âµµ
		Scanner input = new Scanner(System.in);
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
		F = input.nextDouble();
		C = (5.0/9.0)*(F-32.0);
		
		System.out.println((int)F+"È­¾¾¿Âµµ´Â"+C+"¼·¾¾¿ÂµµÀÔ´Ï´Ù.");
		// TODO Auto-generated method stub

	}

}
