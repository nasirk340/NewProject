package JavaClass5;

import java.util.Scanner;

public class logicalOrDemo {

	public static void main(String[] args) {
	
		
		///* ask user to enter today's day
		//* if Monday or Friday--->no class
		//* if Tuesday or Wednesday---manual class
		//*if Saturday or Sunday---Java class
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please entertoday's day");
		
		String day=scan.next();
		if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("no class")){
		System.out.println(" no class today");
		
		} else if ( day.equalsIgnoreCase ("tuesday") || day.equalsIgnoreCase("manual class")){
			System.out.println(" manual class ");
			
		}else if ( day.equalsIgnoreCase ("Wednesday") || day.equalsIgnoreCase("manual class")) {
			System.out.println(" manual class ");
			
		}else if ( day.equalsIgnoreCase ("Sunday") || day.equalsIgnoreCase("java class")) {	
			System.out.println(" java class");
	}
	}

}
