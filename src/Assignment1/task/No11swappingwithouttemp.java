package Assignment1.task;

import java.util.Scanner;

public class No11swappingwithouttemp {

public static void main(String[] args) {
	int x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of x=");
	x = sc.nextInt();
	System.out.println("Enter the value of y=");
	y = sc.nextInt();
	
	x = x*y;
	y = x/y;
	x = x/y;
	System.out.println("After swapping:"  + "x=" + x + ", y=" +y);
}

}
