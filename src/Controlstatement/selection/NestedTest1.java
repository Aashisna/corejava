package Controlstatement.selection;

public class NestedTest1 {
public static void main(String[] args) 
{
	String citizen ="nepali";
	int age = 15;
	String voterid ="no";
	
	if(citizen.equals("nepali")) {
		if(age >=18) {
			//System.out.println("You can vote!");
			
			if(voterid.equals("yes")) {
				System.out.println("You can vote!");
			}else {
				System.out.println("You don't have voterid!");
			}
		}else {
			System.out.println("you are under age!");
		}
		
	}else{
		System.out.println("You are not nepali!");
	}
	
}

}
