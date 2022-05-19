package Controlstatement.selection;

import java.util.Scanner;

public class primecheckers {
public static void main(String[] args) 
{
	int n;
	boolean isPrime = true;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	n = sc.nextInt();
	
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
	else {
		System.out.println(n +" is not a prime number");
	}
	
	
	
}

}
