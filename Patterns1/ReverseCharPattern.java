package Patterns1;

import java.util.Scanner;

public class ReverseCharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print((char)(n-1+'A'-j));
			}
			System.out.println();
		}
	}

}
