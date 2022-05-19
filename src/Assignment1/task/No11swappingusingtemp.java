package Assignment1.task;

import java.util.Scanner;

public class No11swappingusingtemp {

	public static void main(String[] args) {
		int a,b;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a = sc.nextInt();
		System.out.println("Enter the value of b:");
		b = sc.nextInt();
		
		temp = a;
		a = b ;
		b = temp;
		System.out.println("The value after swapping is a=" + a + "\n" );
		System.out.println("The value after swapping is b=" + b );
	}

}
