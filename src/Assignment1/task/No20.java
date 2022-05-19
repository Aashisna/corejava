package Assignment1.task;

import java.util.Scanner;

public class No20 
{
	public static void main(String[] args) 
	{
		int n1,n2;
		char operator;
		int sum,sub,mul,div;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1:");
		n1 = sc.nextInt();
		System.out.println("Enter n2:");
		n2 = sc.nextInt();
		System.out.println("Enter Operator:");
		operator = sc.next().charAt(0);
		
		 switch(operator) 
		 {
		  case '+':
			sum = n1 + n2;
			System.out.println("Addition is:" +sum);
			break;
		  case '-':
			sub = n1 - n2;
			System.out.println("Substraction is:" +sub );
			break;
		  case '*':
		   mul = n1 * n2;
			System.out.println("Multiplication is:" +mul );
			break;
		  case '/':
			div = n1 / n2;
			System.out.println("Multiplication is:" +div );
			break;
		  default:
			  System.out.println("Please select the proper operator");
		 }
		
	}

}
