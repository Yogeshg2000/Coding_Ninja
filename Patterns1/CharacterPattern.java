package Patterns1;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner inp=new Scanner(System.in);
	        int jj= inp.nextInt();
	        for(int i=1;i<=jj;i++){
	            char A=(char)(65+i-1);
	            for(int p=1;p<=i;p++){
	                System.out.print(A);
	                 A=(char)(A+1);
	            }
	            System.out.println();
	        }

	}

}
