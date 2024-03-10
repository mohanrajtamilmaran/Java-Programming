package week2.day4;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		 for(int i=num;i>=1;i--)
		 {//5 4 3 2 1
			fact = fact * i;
			//fact = 1*5=5;
			//fact = 5*4=20;
			//fact = 20*3=60;
			//fact = 60*2=120;
			//fact = 120*1=120;
			System.out.println(fact);

		}
		//System.out.println(fact);

	}

}
