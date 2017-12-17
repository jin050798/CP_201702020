import java.util.Scanner;
public class project_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("키를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int 키;
		int 몸무게;
		키=scan.nextInt();
		System.out.println("몸무게를 입력하시오 : ");
		몸무게=scan.nextInt();
		double 평균;
		평균=(키-100)*0.9;
		
		if(몸무게>평균*1.1)
			System.out.println("과체중");
		else if(몸무게<평균*0.9)
			System.out.println("저체중");
		else
			System.out.println("표준체중");

	}

}
