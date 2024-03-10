package week2.day4;

public class FibonacciSeries {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21

		int n1 = 0, n2 = 1, n3 = 0;
		
		System.out.println(n1 + "\n" + n2);
						//	n1=0      n2=1
		for (int i = 2 ; i <= 7; i++)
			//2 3 4 5 6 7
		{
			n3 = n1 + n2;
		  //n3 = 0 + 1; n3=1;
		  //n3 = 1 + 1; n3=2;
		  //n3 = 1 + 2; n3=3;
		  //n3 = 2 + 3; n3=5;
		  //n3 = 3 + 5; n3=8;
		  //n3 = 5 + 8; n3=13;	
			 System.out.println(n3);//1 2 3 5 8 13
			n1 = n2;
			//n1=1;
			//n1=1;
			//n1=2;
			//n1=3;
			//n1=5;
			//n1=8;
			n2 = n3;
			//n2=1;
			//n2=2;
			//n2=3;
			//n2=5;
			//n2=8;
			//n2=13;
		}

	}

}
