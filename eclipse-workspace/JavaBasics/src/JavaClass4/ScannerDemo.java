package JavaClass4;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerDemo {

	public ScannerDemo(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
// shortcut to import existing class to the current class
		//Mac: cmd+shift+0
		///windows: ctrl+shift+o
		
		String str="Abc";
		str="zyx";
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" please enter your name ");
		String name=scan.next();  // it will capture String value from console
		
		System.out.println(" hello " +name);
		System.out.println(" please enter your age ");
		int age=scan.nextInt();
		System.out.println(name +" you are " +age+ " years old ");
		
		
	}

}
