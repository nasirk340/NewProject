package JavaClass7;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		// Do loop examples
		// lets create a secret number (1 to 100)
        // lets ask user to guess my secret number
		//keep asking for a number till user guess the secret number 
		
		int secretnumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
		
		do {
			System.out.println(" please guess my secret number. it is a number from 1 to 100");
		     userNumber=scan.nextInt();
		  
		} while(userNumber!=secretnumber);
		
		System.out.println("you got it !!!!!!");
		}
		
	}


