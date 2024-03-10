package week2.day5;


public class StringPalindrome {
	public static void main(String[] args) {
		

	//initialize
	//split the characters
	//reverse the each characters and to store
	//verify the store value and given input value
	
	//initialize
	String name ="MOM";
	String temp ="";
	//Split the characters
    char[] charArray=name.toCharArray();
  //  0 1 2
   // M O M
    //reverse the each characters and to store
    for(int i=charArray.length-1;i>=0;i--) {
    	 temp =temp + charArray[i];
    	
    }
    //verify the store value and given input value
    if(temp.equals(name))
    {
    	System.out.println("Palindrome");
    }
    else {
    	System.out.println("Not Palindrome");
    }
    }
}
