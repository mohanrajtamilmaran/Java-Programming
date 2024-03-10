package week3.day2;

public class PrimeNumbers {
public static void main(String[] args) {
	int num =13;
	boolean prime=false;
	for (int i=2;i<=num%2;i++)
	{
		// i=2; 13/2=6.5;++
		// i=3; 13/3=4.3;++
		// i=4; 13/4=3.2;++
		// i=5; 13/5=2.6;++
		if(num%i ==0)
		{
			System.out.println("Not Prime Number");
			prime =false;
			
		}
		
		else if(!prime)
		{
			System.out.println("Prime Number");
		
		}
	}
}
}
