package JavaClass9;

public class AllElementFrom2dArryay {

	public static void main(String[] args) {
		
		// 2d array is array of array
		
		
		

		String [][] groceries= {
				
				{ " banana " , " apple " , " mango "}, //0
				{" potato " , " tomato "}, // =1
				{" milk " , " cheese " , " ayran " , " yogurt "}// =2
		};
				

		for (String [] grocery:groceries) {
			for (String g:grocery) {
				System.out.print(g);
				
			}
		System.out.println();
		
		}
		
		
		
	}

}
