package Controlstatement.selection;

public class primenumbercounting {

	public static void main(String[] args) 
	{
		int count =0;
	
		for(int n=200; n<=500; n++)
		{
		boolean isPrime = true;
		
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(n);
			count++;
		}
		
		}
		System.out.println("Total prime number is:" +count);
	}
}


