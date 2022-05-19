package Assignment1.task;

import java.util.Scanner;

public class No14relate2numbers 
{
	public static void main(String[] args) 
	{
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1 = sc.nextInt();
		System.out.println("Enter the second number:");
		number2 = sc.nextInt();
		
		if(number1>number2)
		{
			System.out.println("The greater number is:"+number1);	
		}
		else if(number1<number2)
		{
			System.out.println("The smaller number is:"+number1);	
		}
		else
		{
			System.out.println("The number is equal:"+number1);	
		}
	}
	}



