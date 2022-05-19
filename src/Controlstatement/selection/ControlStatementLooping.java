package Controlstatement.selection;

public class ControlStatementLooping {

	public static void main(String[] args) 
	{
		int sum =0;
		int osum =0;
		int esum =0;
		for(int i=1; i<=100; i++)
		{
			System.out.println(i);
			if(i%2==0) {
				esum = esum +i;
				
			}
			else if(i%2 !=0)
			{
				osum = osum +i;
				
			}
			System.out.println(i);
		   
		}
		System.out.println("Total even sum is:" + esum);
		System.out.println("Total odd sum is:" + osum);
		System.out.println("Total sum is:" + (esum +osum));
	}

}
