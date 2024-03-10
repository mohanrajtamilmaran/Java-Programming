package week2.day4;

public class Palindrome 
{
	

	public static void main(String[] args)
	{
		String name="malayalam";
		String temp="";
		char[] charArray = name.toCharArray();
		// 0 1 2 3 4 5 6 7 8
		// m a l a y a l a m
		//System.out.println(charArray[0]);
		for (int i = charArray.length-1; i >=0; i--) 
			//8 7 6 5 4 3 2 1 0
		{
			//System.out.print(charArray[i]);
           temp = temp+ charArray[i];
           //temp = m a l a y a l a m;
		}
		if (temp.equals(name))
			//We use if(temp.equals(name)) besause it compare whether the two words are same
		    //if we use if(temp==name) it will compare with the address value and result will
			// not match and else part will be executed
		{
			System.out.println("The given word " + name + " is palindrome");
		}
		else
		{
			System.out.println("The given word " + name + " is not Palindrome");
		}
		
		
	}

}
