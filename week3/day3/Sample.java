package week3.day3;

public class Sample {

public static void main(String[] args)
{    
    
    String str1="Great Power";   
    
    StringBuffer newStr=new StringBuffer(str1);    
        
    for(int i = 0; i < str1.length(); i++) {    
            
        if(i%2==0 && Character.isLowerCase(str1.charAt(i)))
        {    

        	newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
        }    
        else if(i%2!=0 && Character.isUpperCase(str1.charAt(i))) 
        {    
            newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
        }    
    }    
    System.out.println("String after case conversion : " + newStr);    
}    
}     