package Assignment1.task;

import java.util.Scanner;

public class No22Tabledisplaying 
{
public static void main(String[] args) 
{ 
	int number;
	int i=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	number = sc.nextInt();
	do {
		System.out.println(number + "*" + i + "=" +number * i  );
		i++;
	}
	while(i<=10);
	
}

}
