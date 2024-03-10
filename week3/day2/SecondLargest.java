package week3.day2;

import java.util.Arrays;

public class SecondLargest {
public static void main(String[] args) {
	int num[]= {8,7,1,2,4,5,6,3};
	Arrays.sort(num);
	//1 2 3 4 5 6 7 8
	int Res=num[num.length-2];
	System.out.println("The second largest number:"+Res);
	System.out.println("The second smallest number:"+num[1]);
}
}
