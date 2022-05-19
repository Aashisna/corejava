package Assignment1.task;

import java.util.Scanner;

public class No13 {
public static void main(String[] args) {
	int number;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	number = sc.nextInt();
	if(number>0)
	{
		System.out.println("The number is positive:" + number);
	}
	else if(number<0)
	{
		System.out.println("The number is negative:" + number);
	}
	else 
	{
		System.out.println("The number is zero:" + number);
	}
}

}
