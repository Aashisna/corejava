package Controlstatement.selection;

import java.util.Scanner;

public class IfElseTest1 {
public static void main(String[] args) {
	int n,m;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	n = sc.nextInt();
	System.out.println("Enter the second number:");
	m = sc.nextInt();
	
	if(n>m) {
		System.out.println(n + " " + "is greater");
	}
	else
	{
		System.out.println(m + " " + "is greater");
	}
}

}
