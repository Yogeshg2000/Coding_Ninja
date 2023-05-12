package ConditionAndLoops;

import java.util.Scanner;

public class SUmEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		int esum=0,osum=0;
		while(n>0)
		{
			int r=n%10;
			if(r%2==0)
			{
				esum+=r;
			}
			else {
				osum+=r;
			}
			n=n/10;
		}
		System.out.println(esum+"\n"+osum);

	}

}
