package ConditionAndLoops;

import java.util.Scanner;

public class FerenhateToCelseus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int str=s.nextInt();
		int end=s.nextInt();
		int stp=s.nextInt();
		for(int i=str;i<=end;i=i+stp)
		{
			int c=(int)((i - 32) / (1.8));
			System.out.println(i+" "+c);
		}

	}

}

