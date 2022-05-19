package Assignment1.task;
import java.util.Scanner;
public class Number6Perimeter 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int l,b,r;         // l,b for rectangle and r for circle
	int perimeterR;         //for rectangle
	double perimeterC;     //for circle
	int s1, s2,s3;  // for triangle
	int perimeterT;        //for triangle
	
	System.out.println("Enter the length:");
	l = sc.nextInt();
	System.out.println("Enter the breadth:");
	b = sc.nextInt();
	perimeterR = 2*(l+b);
	System.out.println("The perimeter of rectangle is:"+perimeterR);   //perimeter of rectangle is displayed
	System.out.println("\n");
	
	System.out.println("Enter the radius:");
	r = sc.nextInt();
	perimeterC = (2*r)*Math.PI;                                 
	System.out.println("The perimeter of circle is:"+perimeterC); //perimeter of circle is displayed
	System.out.println("\n");
	
	System.out.println("Enter the s1 of triangle:");
	s1 = sc.nextInt();
	System.out.println("Enter the s2 of triangle:");
	s2 = sc.nextInt();
	System.out.println("Enter the s3 of triangle:");
	s3 = sc.nextInt();
	perimeterT = s1+s2+s3;
	System.out.println("The perimeter of triangle is:"+perimeterT);	//perimeter of triangle is displayed

}
}
