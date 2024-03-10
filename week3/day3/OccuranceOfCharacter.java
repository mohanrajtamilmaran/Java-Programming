package week3.day3;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		String name ="Testleaf";
		char[] charArray = name.toCharArray();
		int count=0;
		for(int i=0;i<charArray.length;i++)
		{
			if('e'==charArray[i])
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
