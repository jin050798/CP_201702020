import java.util.Scanner;
public class Movie {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int x;
		int y;
		int [] arr = {0,0,0,0,0,1,1,1,0,0,};
		System.out.print("좌석을 예약하시겠습니까? (1 또는 0) ");
		x=input.nextInt();
		while(x!=0) {
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10 ");
			System.out.println("------------------------");
			for(int i = 0; i<10; i++) 
				System.out.print(arr[i]+" ");
				System.out.println(" ");
			System.out.print("몇 번째 좌석을 예약하시곘습니까? ");
			y = input.nextInt();
		
			if(arr[y-1]==0)
			{
				System.out.println("예약되었습니다.");
				arr[y-1]=1;
			}
			else
				System.out.println("이미 예약된 자리입니다.");
		}
	}
}