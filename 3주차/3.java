public class project_5{
	public static void main(String args[]) {
		
		for(int i=0; i<9; i++)
		{
			if(i<5)
			{
				for(int j=0; j<9; j++)
				{
					if(j<4 - i || j > 4 +i )
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
			}
			else
			{for (int j =0; j<9; j++)
			{
				if(j<i-4 || j > 8-(i-4))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			}
			System.out.println();
		}
	}
}