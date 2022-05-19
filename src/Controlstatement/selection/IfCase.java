package Controlstatement.selection;

import java.util.Scanner;

    public class IfCase {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int p, t,r;
			int I;
			int SI;
			System.out.println("Enter the principal");
			p= sc.nextInt();
			System.out.println("Enter the time");
			t= sc.nextInt();
			System.out.println("Enter the rate");
			r= sc.nextInt();
			int result = (p*t*r)/100;
			I = result;
			System.out.println(I);
		
	}

}
