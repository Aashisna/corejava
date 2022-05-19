package Controlstatement.selection;

import java.util.Scanner;

public class IfTest {
	/*
	 * #use to check single condition
	 * syntax:
	 * if(condition){
	 *   //statement
	 * }
	 */
	public static void main(String[] args) {
		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary:");
		salary = sc.nextInt();

		//salary = salary + 5000;
		if(salary<30000)
		{
			salary = salary + 5000;
		}
		
		System.out.println("The salary is:" +salary);
	

}
}
