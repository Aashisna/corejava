package Assignment1.task;

import java.util.Scanner;

public class No19ThreesidesOfTriangleAndtypes 
{
public static void main(String[] args) 
{
	int s1,s2,s3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the s1 of triangle:");
	s1 = sc.nextInt();
	System.out.println("Enter the s2 of triangle:");
	s2 = sc.nextInt();
	System.out.println("Enter the s3 of triangle:");
	s3 = sc.nextInt();
	
	if(s1==s2 && s2==s3 && s1==s3) 
	{
		System.out.println("It is a equilateral triangle:" +s1);
	}
	else if (s1==s2 || s2==s3 || s1==s3)
	{
		System.out.println("It is a isosceles triangle" );
	}
	else
	{
		System.out.println("It is a scalene triangle" );
	}
}
	
}
