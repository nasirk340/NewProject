package TeamworkTasks;

public class TeamTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   Create a 2D array of integer values. Print the sum of all numbers.
		int[][] a = {
		        {3,2,1}, 
		        {3,3,2}, 
		        {3,5,3}, 
		        {0,1,2}, 
		    };
		    int sum=0;
		    for (int i=0; i<a.length;i++){
		      for (int j=0;j<a[i].length;j++){
		        sum+=a[i][j];
		        
		      }
		        
		    }
		    System.out.println(sum);
	    
	}

}