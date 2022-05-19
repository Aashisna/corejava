package Assignment1.task;

import java.util.Scanner;

public class Number3SumandAverage {
	public static void main(String[] args) {
		int a,b;
		int sum;
		int average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		sum = a+b;
		average = sum/2;
		System.out.println("The sum of the number is:" + sum);
		System.out.println("The average of the number is:" + average);
		
		
	}

}
