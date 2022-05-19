package Assignment1.task;

import java.util.Scanner;

public class No21display7days 
{
	public static void main(String[] args)
	{
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for days:");
		day = sc.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.println("It's Sunday");
			break;
		case 2:
			System.out.println("It's Monday");
			break;
		case 3:
			System.out.println("It's Tuesday");
			break;
		case 4:
			System.out.println("It's Wednesday");
			break;
		case 5:
			System.out.println("It's Thursday");
			break;
		case 6:
			System.out.println("It's Friday");
			break;
		case 7:
			System.out.println("It's Saturday");
			break;
		default:
			System.out.println("Enter the number within the range:");
		}
	}
}
