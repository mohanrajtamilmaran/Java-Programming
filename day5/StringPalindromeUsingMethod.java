package week2.day5;

public class StringPalindromeUsingMethod {
	public String stringpalindrome(String name) {
       String temp="";
     //  char[]charName= name.charAt();
       char[] charArray=name.toCharArray();
       for(int i= charArray.length-1;i>=0;i++)
       {
    	   temp=temp+charArray[i];
       }
       if(temp.equals(name))
       {
    	   System.out.println("Palindrome");
       }
       else
       {
    	   System.out.println("NOT Palindrome");
       }
       return temp ;
	}
	public static void main(String[] args) {
		System.out.println("Enter the Name to check Palindrome");
		StringPalindromeUsingMethod ch = new StringPalindromeUsingMethod();
		ch.stringpalindrome("name");
		
	}
	

}
