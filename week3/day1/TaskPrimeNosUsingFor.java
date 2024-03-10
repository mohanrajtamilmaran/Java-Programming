package week3.day1;

public class TaskPrimeNosUsingFor
{
	public static void main(String[] args)
	{
		int num = 24;
		
		for (int i = 0; i < num; i++)
			
		{
			if (i <= 1)
			{
			System.out.println("false");
		}

			else if ((i % 2) != 0)
			{
				System.out.println(i + " is a prime number");
			}
			else 
			{
				System.out.println(i + " is a non-prime number");
			}
		}
	}

}
