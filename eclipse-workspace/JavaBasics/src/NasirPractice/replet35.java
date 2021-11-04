package NasirPractice;

import java.util.Scanner;

public class replet35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("do you need a loan");
		Scanner scanner=new scanner(System.in);
		boolean isloanrequired=scanner.nextIn();
		
		if(isloanrequired) {
			System.out.println("what is your credit score");
			int creditscore=scanner.nextInt();
			 
			if (creditscore<600) {
				System.out.println("the eligibility is not eligible");
			}else if(creditscore>=600 &&creditscore <= 700) {
				
			}
		}else {
			System.out.println("unkown");
			
		}
		
		
		
	}

}
