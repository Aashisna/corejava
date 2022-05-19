package Controlstatement.selection;

public class DoWhile {

	public static void main(String[] args) 
	{
		/*
		 * syntax:
		 * do{
		 * //statements
		 * }
		 * while(condition);
		 */
		int number=9;
		int i=1;
		do {
		
			System.out.println(number + "*" + i + "=" +number * i  );
			i++;
		}
		while(i<=15);
	}

}
