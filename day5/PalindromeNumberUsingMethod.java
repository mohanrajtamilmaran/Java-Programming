package week2.day5;

public class PalindromeNumberUsingMethod {
	public int palindromeNumber(int num) {
      int rem;
      int rev=0;
      int temp =num;
      while(num>0)
      {
    	  rem=num%10;
    	  rev=rev*10+rem;
    	  num=num/10;
      }
     // System.out.println("The reverse of the String is"+rev);
      if(temp==rev)
      {
    	  System.out.println("The given number "+rev + " is  Palindrome");
      }
      else
      {
    	  System.out.println("The given number "+rev + " is Not Palindrome");
      }
      return 0;
	}
	public static void main(String[] args) {
		PalindromeNumberUsingMethod paliNo=new PalindromeNumberUsingMethod();
		paliNo.palindromeNumber(545);
		System.out.println(paliNo.palindromeNumber(545));
	}

}
