package JavaClass4;

public class Deploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/////Write a program to store a boolean value of whether user has diploma or not. 
		//If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		////Then if user has a degree program should check a Gpa score. 
		////If gpa score is higher or equals to 3.5 → output should say 
		///“You are eligible for scholarship”, otherwise → “You should have studied harder” .
		
		
		boolean Completeddiploma=true;
		double  gpascore= 3.5;
		
		if(Completeddiploma) {
			
			if (Completeddiploma) {
				System.out.println("congratulations");
			} if (gpascore>3.5) {
				System.out.println("you should get your degree");
			}else if (gpascore >3.5) {
				System.out.println("you ahouls studay harder");
			} else { 
				System.out.println("You are eligible for scholarshipYou");
			}
		
		}else {
			System.out.println("get a degree");
		}
	}

}
