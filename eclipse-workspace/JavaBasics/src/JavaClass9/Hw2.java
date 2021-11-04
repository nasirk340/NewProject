package JavaClass9;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array of animals and store 6 elements into it. 
		//Using 2 different loops print all elements from the array.
		
		
		String [] Animals =new String [] {"cat","dog","loin","horse","bird","tiger"};
		
		for (String i:Animals) {
			System.out.println( i+" ");
			System.out.println();
		}
		System.out.println("********************************");
		for (int n=0; n< Animals.length; n++) {
			System.out.println(Animals[n] + " ");
		}
	}

}
