package Assignment1.task;

import java.util.Scanner;

public class Displayin3lines 
{
	public static void main(String[] args) 
	{
		String  str;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the greetings:");
		 str = sc.nextLine();
		 System.out.print("\n");
		 for(i=1; i<=3; i++)
		 {
		 System.out.println("Hello!" + "\n" + " " + str +"\n" +"bye!");
		 System.out.print("\n");
	
		 }   
	}

}
