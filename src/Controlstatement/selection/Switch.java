package Controlstatement.selection;

import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String post ;
		float basicSalary = 0;
		float bonus;
		float totalSalary;
		
		System.out.println("Enter the post");
		post = sc.next();
		System.out.println("Enter the basicSalary");
		 basicSalary = sc.nextInt();
		
		
		switch(post)
		{
			case "MD": 
				totalSalary = basicSalary * 0.2f;
				System.out.println(totalSalary);
				break;
			case "CEO":
				totalSalary = basicSalary * 0.1784f;
				System.out.println(totalSalary);
				break;
			case "Manager":
				totalSalary = basicSalary * 0.1784f;
				System.out.println(totalSalary);
				break;
			case "Helper":
				totalSalary = basicSalary * 0.1784f;
				System.out.println(totalSalary);
				break;
				
			default:
					System.out.println("Enter the corect input");
		}
	
	}


}
