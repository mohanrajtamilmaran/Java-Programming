package week3.day1;

import java.util.Arrays;

public class indDuplicate {
public static void main(String[] args) {
	int num[]= {2,3,1,4,5,6,4};
	
	// 1 2 3 4 5 6
	Arrays.sort(num); 
	// This is the method used to arrange the values in accending order
	
	
	//System.out.println(num[0]);
	for(int i=0;i<num.length;i++)
	{
	  for(int j=i+1;j<num.length;j++)
	  {
		  if(num[i]==num[j])
		  {
			  System.out.println(num[j]);
		  }
		  //dataType []variableName=new dataType[range];
		  String [] name =  new String[5];
		  name[0]="Bilal";//1
		  name[1]="Kesav";//2
		  name[2]="Anburaj";//3
		  name[3]="Manikandan";//4
		  name[4]="Arish";//5
		  //name[5]="Palani";
		  System.out.println(name[0]);
	  }
		
	}
	
	}
	
}


