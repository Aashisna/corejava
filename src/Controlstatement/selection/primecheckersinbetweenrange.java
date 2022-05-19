package Controlstatement.selection;

import java.util.Scanner;

public class primecheckersinbetweenrange {

	public static void main(String[] args) 
	{
		for(int n=200; n<=500; n++)
		{
		boolean isPrime = true;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number:");
		//n = sc.nextInt();
		
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(n +" is prime number");
		}
		
		}
		}

}
