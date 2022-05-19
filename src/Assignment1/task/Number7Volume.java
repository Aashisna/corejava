package Assignment1.task;

import java.util.Scanner;

public class Number7Volume 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int radius;       //  for cylinder's radius
		int height;        //for height
		double volumeC;        //for volume of cylinder
		
		System.out.println("Enter the radius:");
		radius = sc.nextInt();
		System.out.println("Enter the height:");
		height = sc.nextInt();
		volumeC = Math.PI*(radius*radius*height);
		System.out.println("The perimeter of rectangle is:"+volumeC); 
	}

}
