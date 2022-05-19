package Assignment1.task;

import java.util.Scanner;

public class No24factorial 
{
	public static void main(String[] args) 
	{
		int number,i;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		
		for(i=1; i<=number;)
		{
			fact = fact*i;
			i++;
		}
		System.out.println("The factorial of entered number is:" +fact);
	}


}
