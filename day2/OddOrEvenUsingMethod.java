package week2.day2;

public class OddOrEvenUsingMethod {
	
	public int oddEven() {
		int i = 0;
		for(i=0;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println("The number is Odd: "+i);
			}
			
		}
		return i;
	}
	public static void main(String[] args) {
		OddOrEvenUsingMethod oe=new OddOrEvenUsingMethod();
		System.out.println(oe.oddEven());
		oe.oddEven();
				
	}

}
