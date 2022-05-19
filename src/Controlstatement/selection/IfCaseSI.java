package Controlstatement.selection;

import java.util.Scanner;

public class IfCaseSI 
{

	public static void main(String[] args) 
	{
		int P,T,R;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal");
		P = sc.nextInt();
		System.out.println("Enter the Time");
		T = sc.nextInt();
		System.out.println("Enter the Rate");
		R = sc.nextInt();
			if(P != 0)
			{
			int SI = (P*T*R)/100;
			System.out.println(SI);
			}
		
		}
	}


