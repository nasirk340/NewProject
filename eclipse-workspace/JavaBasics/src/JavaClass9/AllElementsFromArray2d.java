package JavaClass9;

public class AllElementsFromArray2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] [] numbers= {
				
				{100, 200, 300},
				{9, 8, 7}
				
				};
		
		System.out.println("Size of 2D array =" +numbers.length);
		System.out.println(numbers[1][1]); //9
		
		 // get all elements
		
		for (int [] nums:numbers) {
			for (int n:nums) {
				 System.out.println(n+" ");
			}
		System.out.println();
		
		}
		System.out.println(" get all element using regular for loop");
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
			int element = numbers[i][j];
			System.out.println();
			}
		}
	}

}
