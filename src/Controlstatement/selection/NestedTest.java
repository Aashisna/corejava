package Controlstatement.selection;

public class NestedTest {
	public static void main(String[] args) {

	String citizen ="nepali";
	int age = 45;
	
	if(citizen.equals("nepali")) {
		if(age >=18) {
			System.out.println("You can vote!");
		}else {
			System.out.println("you are under age!");
		}
		
	}else{
		System.out.println("You are not nepali!");
	}
	
	
}
}

