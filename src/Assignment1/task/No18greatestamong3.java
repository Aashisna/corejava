package Assignment1.task;

import java.util.Scanner;

public class No18greatestamong3 {
	public static void main(String[] args) 
	{
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		num2 = sc.nextInt();
		System.out.println("Enter the third number:");
		num3 = sc.nextInt();
		System.out.println("\n");
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("The greatest number is:" +num1);
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println("The greatest number is:" +num2);
		}
		else 
		{
			System.out.println("The greatest number is:" +num3);
		}
		
	}

	

}
