package ConditionAndLoops;

import java.util.Scanner;

public class FindPowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt(),p=s.nextInt(),ans=1;
		 if(n<=0 && p<=0)
		{
			ans=1;
		} else if(n<=0)
		{
			ans=0;
		}
		else if(p<=0)
		{
			ans=1;
		}
		else {
		for(int i=0;i<p;i++ )
		{
			ans=ans*n;
		}
		}
		System.out.println(ans);
	}

}
