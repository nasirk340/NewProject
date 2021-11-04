package JavaClass6;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1=in.nextInt();
		System.out.println("Enter your second number");
		int num2=in.nextInt();
		System.out.println("Enter your second operator + ,- * or /");
		char operator=in.next().charAt(0);
		int result=0;
		switch(operator) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		}
		System.out.println(result);
		
		
		
	}

}
