package JavaClass7;

import java.util.Scanner;

public class GuessNumberWithWhileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int secretNumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		System.out.println(" please guess my secret number. it is a number from 1 to 100");
		userNumber=scan.nextInt();
		 while(userNumber!=secretNumber) {
			 System.out.println(" please guess my secret number. it is a number from 1 to 100");
			 userNumber=scan.nextInt();
		 }
	
	System.out.println("you got it !!");
	
	
	}
	
	

}
