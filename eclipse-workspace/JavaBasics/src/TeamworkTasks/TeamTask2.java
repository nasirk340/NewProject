package TeamworkTasks;

public class TeamTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 * 
		 */

		int [][] num= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int even=0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length+1; j++) {
				even=num[i][j];
				if(num[i][j]%2==0) {
					System.out.print(num[i][j]+" ");
				}
			}
		}
		
		
		
		
		
	}

}
