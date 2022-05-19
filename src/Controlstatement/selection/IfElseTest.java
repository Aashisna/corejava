package Controlstatement.selection;

import java.util.Scanner;

public class IfElseTest 
{
 /*syntax:
  * if(condition)
  * {
  *   //statements
  * }
  * else(condition)
  * {
  *   //statements
  * } 
  */
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		if(n%2 == 0)
		{
			System.out.println(n + " " +"is even number");
		}
		else
		{
			System.out.println(n  + " "+"is odd number");
		}
		
	}
	 

}
