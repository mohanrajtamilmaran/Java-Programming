package week3.day3;

public class CountOccuranceTeach {
	public static void main(String[] args) {
		String name = "Testleaf";
		int count=0;
		
		for(int i=0;i<name.length();i++)
		{
			char charAt = name.charAt(i);
		//	System.out.println(charAt);
			if(charAt =='t') {
				count++;
			}
		}
		
			System.out.println("Character occurance is"+count);
			
	}

}
