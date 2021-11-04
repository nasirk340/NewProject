package JavaClass7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// I want to ask a user their name and age 5 times
		
		Scanner scan=new Scanner(System.in);
		
		int i=5;
		while(1>=1) {
		System.out.println("please enter your name and age");
		
		String name=scan.next();
		int age=scan.nextInt();
		
		
		System.out.println(" your name is "+name+" and you are "+age+"years old");
	
		i--;
		
		}

}
}