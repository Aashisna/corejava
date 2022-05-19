package Assignment1.task;

import java.util.Scanner;

public class Number9Poundtokg {

	public static void main(String[] args) {
		float pound;
		float result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pound value:");
		pound = sc.nextFloat();
		//1 pound is 0.454 kg
		result = pound * 0.454f;
		System.out.println("The required value in kg is:" +result);
		
	}

}
