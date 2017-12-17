import java.util.Scanner;
public class project4 {

	public static void main(String[] args) {
		
		double radius;	// 원의 반지름
		double height;	// 원기둥 높이
		double volume;	// 원기둥의 부피
		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		radius = input.nextDouble();;
		System.out.print("원기둥의 높이를 입력하시오: ");
		height = input.nextDouble();
		volume = 3.141592*radius*radius*height;
		
		System.out.println("원기둥의 부피는"+volume+"입니다.");
		// TODO Auto-generated method stub

	}

}
