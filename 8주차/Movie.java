import java.util.Scanner;
public class Movie {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int x;
		int y;
		int [] arr = {0,0,0,0,0,1,1,1,0,0,};
		System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0) ");
		x=input.nextInt();
		while(x!=0) {
			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			System.out.println("------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10 ");
			System.out.println("------------------------");
			for(int i = 0; i<10; i++) 
				System.out.print(arr[i]+" ");
				System.out.println(" ");
			System.out.print("�� ��° �¼��� �����ϽÁٽ��ϱ�? ");
			y = input.nextInt();
		
			if(arr[y-1]==0)
			{
				System.out.println("����Ǿ����ϴ�.");
				arr[y-1]=1;
			}
			else
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
		}
	}
}