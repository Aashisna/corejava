package Assignment1.task;

import java.util.Scanner;

public class Number8fahtoC 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	float C, F;
	System.out.println("Enter the celcius value:");
	C = sc.nextFloat();
	F = (C * 9/5) + 32;
	System.out.println("The required fahrenheit value is:"+F);  // Fahrenheit calculation
	System.out.println("\n");
	
	System.out.println("Enter the fahrenheit value:");
	F = sc.nextFloat();
	C = (F - 32) * 5/9;
	System.out.println("The required fahrenheit value is:"+C);  //Celcius calculation
}

}
