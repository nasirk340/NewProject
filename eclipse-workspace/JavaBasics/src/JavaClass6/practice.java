package JavaClass6;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ////  // Ask user to enter their country and capture it.
		  //Once values are captured print which language user speaks.
		
		Scanner inp = new Scanner(System.in);
		System.out.println("please enter your country"); 
		String country= inp.next();
		String language= inp.next();
		switch ("country") {
		case "afghanistan":
			language= "pashto";
			break;
		case "india":
			language = "handi";
			break;
		case "iran":
			language = "farsi";
			break;
		case "uk":
			language = "english";
			break;
		default: 	
			language= "pashto";
			
	}
if (!language.equals("unknown")) {
System.out.println(" your country is "+country+ "and your language is "+language);
}else {
	System.out.println(" please put another country"); 
	
}
}
}