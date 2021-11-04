package JavaClass9;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// let's create an 2D array of groceries
		
		
		String [][] groceries= {
				
				{"banana","apple","mango"}, //0=3
				{"potato ","tomato"}, // =1
				{"milk" , "cheese","ayran","yogurt"}// =3
		};
				
				System.out.println(groceries.length);   //# of arrays
				
				System.out.println(groceries.[2][3]);	// yogurt
		
		// I want to find how many elements my 1 array has 
	

		System.out.println(" # elements inside 1 array = "+groceries[0].length);
	    System.out.println(" # elements inside 2 array = "+groceries[1].length);
	    System.out.println(" # elements inside 3 array = "+groceries[2].length);
		
	    // how do we get all element from 2D array ?????
	     int total=0;
	     
		 for (int i=0; i<groceries.length; i++) {
			 
	    	 for (int j=0; j< groceries [i].length; j++) {
	    		 
	    		 System.out.println(groceries[i] [j] + " ");
	    	 
	    		 total++;
	    	 }
                System.out.println();
        }
		 System.out.println("# of element inside 2D arrar is =" +total);
	     System.out.println("--------------------------------------");

      }
}
		