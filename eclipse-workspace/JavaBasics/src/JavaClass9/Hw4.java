package JavaClass9;

public class Hw4 {

	private static int a;
	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array on integers and calculate the sum of all elements in an array
		
		int num[]= {22, 60, 19, 33, 91, 12, 100};
		int sum= 0;
		for (int b =0; b <num.length; b++) {
	
		System.out.print(num[b]+ "+");
		sum += num[b];
		
		
		
	}

	System.out.println("=" +sum);
	
}
}