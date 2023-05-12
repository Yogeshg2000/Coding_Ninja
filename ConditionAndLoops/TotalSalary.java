package ConditionAndLoops;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int basicSalary = s.nextInt();
        String grade = s.next();
        double totalSalary = basicSalary + (basicSalary * 0.2) + (basicSalary * 0.5) - (basicSalary * 0.11);

            if(grade.charAt(0) == 'A') {
                totalSalary = totalSalary + 1700;
            } else if(grade.charAt(0) == 'B') {
                totalSalary = totalSalary + 1500;
            } else {
                totalSalary = totalSalary + 1300;
            }
        System.out.print(Math.round(totalSalary));
        
	}

}
