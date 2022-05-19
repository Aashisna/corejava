package Assignment1.task;

import java.util.Scanner;

public class DisplayingIntroin3lines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Tell me about yourself:");
		str = sc.nextLine();
		System.out.println("\n");
		for(int i=0; i<=3; i++)
		{
		System.out.println(str);
	    }
	}

}
