package week3.day3;

public class ChangeOddToLowercaseAndEvenToUppercase {
	public static void main(String[] args) {
		String name="ChangeMe";
		String result="";
		char[] charArray = name.toCharArray();
		// c h a n g e m e
		// 0 1 2 3 4 5 6 7
		for(int i=0;i<charArray.length;i++)
			//0 1 2 3 4 5 6
		{
			char c = charArray[i];
			//c
			//h	
			//a			
			//n			
			//g			
			//e			
			//m
			//m
			//e
		    if(i%2==0)
		    	//c
		    	//a
		    	//g
		    	//m
		    	//e	
		    {
		    	//result=C A G M E
		    	result=result+Character.toUpperCase(c); 	
		    }
		    else
		    {
		    	result=result+charArray[i];
		    	//result=ChAnGeMe
		    }
		}
		System.out.println(result);
		
	}

}
