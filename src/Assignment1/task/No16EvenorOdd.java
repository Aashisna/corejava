package Assignment1.task;

import java.util.Scanner;

public class No16EvenorOdd 
{
	public static void main(String[] args) 
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		
		if(number%2 == 0)
		{
			System.out.println("You entered even number:"+number);	
		}
		else if(number%2 != 0)
		{
			System.out.println("you entered odd number:"+number);	
		}
	}

}
