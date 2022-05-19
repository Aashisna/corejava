package Assignment1.task;

import java.util.Scanner;

public class No15ASCIIcode 
{
	public static void main(String[] args) 
	{
		 char ch;
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the character:");
	     ch = sc.next().charAt(2);
         int ascii = ch;
    System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
