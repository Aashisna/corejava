package Assignment1.task;

import java.util.Scanner;

public class No12 {
public static void main(String[] args) {
	int rollno;
	String name;
	String natlity;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name:");
	name = sc.nextLine();
	System.out.println("Enter the rollnumber:");
	rollno = sc.nextInt();
	System.out.println("Enter the nationality:");
	natlity = sc.next();
	//System.out.println("\n");
	
	System.out.println("Your name is:" +name);
	System.out.println("Your rollnumber is:" +rollno);
	System.out.println("Your nationality is:" +natlity);
	
}
}
