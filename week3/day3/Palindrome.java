package week3.day3;

public class Palindrome 
{
public static void main(String[] args)
{
	String name ="Bilal";
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		char reverse = name.charAt(i);
		//System.out.println(reverse);
		rev=rev+reverse;
		System.out.println(rev);
	}
	if(rev.equals(name))
	{
		System.err.println(name+"is Palindrome");
	}
	else
	{
		System.out.println(name+"is not Palindrome");
	}
}
}
