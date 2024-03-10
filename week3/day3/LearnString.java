package week3.day3;

public class LearnString {
 public static void main(String[] args) {
	

	//String Literal
	String name ="Testleaf";
	String name1="BILAL";
	String name2="bilal";
	// String Instance
	String insta = new String("Testleaf");
	if(name==insta)
	{
		System.out.println("equal");
	}
	if(name.equals(insta))
	{
		System.out.println("Equal");
	}
	if(name1.equalsIgnoreCase(name2))
	{
		System.out.println("name1");
	}
	int length = name1.length();
	System.out.println(length);
	// length();---- is used in string as a method 
	// string does not accept property;
	// length;----- is esed in array as a property
	char[] charArray = name.toCharArray();
	char c = charArray[0];
	System.out.println(c);
	String upperCase = name.toUpperCase();
	System.out.println(upperCase);
	
	boolean contains =name.contains("esf");
	System.out.println(contains);
	char charAt = name.charAt(1);
	System.out.println(" hi"+charAt);
	
	
}
}