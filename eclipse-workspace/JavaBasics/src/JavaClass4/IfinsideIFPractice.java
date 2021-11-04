package JavaClass4;

public class IfinsideIFPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean replCompleted=true;
		int assignments=5;
		
		if(replCompleted) {
			
			if (assignments>16) {
				System.out.println("you did an amazing work");
			} else if (assignments >10) {
				System.out.println("you did good, but you should do more");
			}else if (assignments >6) {
				System.out.println("you need to try do more");
			} else { 
				System.out.println("why?");
			}
		
		}else {
			System.out.println("please mak sure you do your homework");
			
	}

	}
}
