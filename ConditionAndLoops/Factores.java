package ConditionAndLoops;

import java.util.Scanner;

public class Factores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter a num:");
		int n=s.nextInt();
		for (int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
