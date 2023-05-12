package ConditionAndLoops;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter how much num u want to enter:");
		int n=s.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>0) {
				System.out.println("Positive");
			}
			else {
				System.out.println("Negative");
			}
		}

	}

}
