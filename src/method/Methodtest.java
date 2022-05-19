package method;

import java.util.Scanner;

public class Methodtest {

	public static void main(String[] args) 
	{
		sum();
		areaR();
		areaC();
		printTable(10);
	}
	
	//1. no return type with no arguments
	 static void sum()
	{
		int a = 700;
		int b = 500;
		int s = a+b;
		System.out.println("Total sum is:" +s);
	}
	 static void areaR() {
		 int l = 10;
		 int b = 20;
		 float area = l*b;
		 System.out.println("Area of rectangle is:" +area);
	 }
	 static void areaC() {
		 float r;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the radius:");
		  r = sc.nextInt();
		  float area; 
		  area = (float) ((r*r)*Math.PI);
		  System.out.println("Area of rectangle is:" +area);
	 }
	 // 2. no return type with arguments
	      static void printTable(int n) 
	     {
	    	 for(int i=1; i<=10; i++)
	    	 {
	    		 System.out.println(n + "*" + i + "=" + (n*i));
	    	 }
	     }

}
