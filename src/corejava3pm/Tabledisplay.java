package corejava3pm;
import java.util.Scanner;

public class Tabledisplay 
{
	public static void main(String[] args) 
	//public: access everywhere
	// protected: access in same class, same package, child class of different package
	//default(package private): access in same class and same package only
	//private: access in same class only.
	{
		Scanner myObj = new Scanner(System.in);
		int n ,age;
		String name;
		int i=0;
		 
		System.out.println("Enter the serial no:");
	    n = myObj.nextInt();
		for(i=0; i<= n; i++)
		{
			//age = myObj.nextInt();
			 System.out.println("Enter the Age:");
			    age = myObj.nextInt();
			    System.out.println("Enter the Name:");
			    name = myObj.next();
			    System.out.printf("%-10s %10s %10s \n","SN","Age","Name");
		    System.out.printf("%-10s %10s %10s\n","" +i, "" +age, ""+name); 
		}  
	}
}
		

	
