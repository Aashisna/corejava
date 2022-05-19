package Controlstatement.selection;

public class EnhanceForloop {


/*  ==========Enhance For Loop===========
 * # use to read data from collection
 * 
 * syntax:
 * for(data_type var: collection){
 *   //statements
 *   }
 */
   
	public static void main(String[] args) 
	{
		int data[] = {29,37,49,58,35,69,20};
		int s = 0;
		for(int x:data) 
		{
			System.out.println(x);
			s += x;
		}
		System.out.println("Total =" +s);
	}
}
