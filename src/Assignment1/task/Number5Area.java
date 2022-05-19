package Assignment1.task;

import java.util.Scanner;

public class Number5Area 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	int l,b,r;         // l,b for rectangle and r for circle
	int areaR;         //for rectangle
	double areaC;     //for circle
	int base, height;  // for triangle
	int areaT;        //for triangle
	
	System.out.println("Enter the length");
	l = sc.nextInt();
	System.out.println("Enter the breadth");
	b = sc.nextInt();
	areaR = l*b;
	System.out.println("The area of rectangle is:"+areaR);   //area of rectangle is displayed
	System.out.println("\n");
	
	System.out.println("Enter the radius");
	r = sc.nextInt();
	areaC = (r*r)*Math.PI;                                 
	System.out.println("The area of circle is:"+areaC); //area of circle is displayed
	System.out.println("\n");
	
	System.out.println("Enter the base of triangle");
	base = sc.nextInt();
	System.out.println("Enter the height of triangle");
	height = sc.nextInt();
	areaT = (base*height)/2;
	System.out.println("The area of triangle is:"+areaT);	//area of triangle is displayed
}
}
