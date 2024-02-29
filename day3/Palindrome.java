package week2.day3;

public class Palindrome {
	
public static void main(String[] args) {
	int num =545;
	int reminder;
	int sum=0;
    int temp =num;	

	while(num>0)
	{
		reminder=num%10;
		sum= (sum*10)+reminder;//1//sum =(0*10)+4==4
						       //2//sum=(4*10)+3==43
						       //3//sum=(43*10)+5==435
		num=num/10;
		
	}
	if(sum==temp)
	{
		System.out.println("The Given Number is Palindrome");
	}
	else
	{
		System.out.println("The Given Number is not Palindrome");
	}
}
}
