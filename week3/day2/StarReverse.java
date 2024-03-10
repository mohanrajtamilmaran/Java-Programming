package week3.day2;

public class StarReverse {
	public static void main(String[] args) {
		for(int i=6;i>=0;i--)
		{
			//6 5 4 3 2 1 0
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
