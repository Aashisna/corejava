package Assignment1.task;

import java.util.Scanner;

public class No23SummingNaturalNumber 
{
	public static void main(String[] args) 
	{
		int number;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		
		for(int i=0; i<=number; )
		{
			sum = sum + i;
			i++;
		}
		System.out.println("The nth sum is:" +sum);
	}


}
