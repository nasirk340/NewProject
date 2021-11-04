package Javacalss11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog alonasDog= new Dog();
		
		alonasDog.name="Lexy";
		alonasDog.breed="american hound";
		alonasDog.colors="Black";
		alonasDog.height=2.5;
		alonasDog.age=10;
		alonasDog.gender='M';
		
		System.out.println("My Dog Name is " +alonasDog.name);
		System.out.println("His Breed is " +alonasDog.breed);
		System.out.println("His color is " +alonasDog.colors);
		
	System.out.println("*****************************************");
	
	Dog jimmaysDog= new Dog();
	
	jimmaysDog.name="teddy";
	jimmaysDog.breed="Labrador Retriever";
	jimmaysDog.colors="Golden";
	jimmaysDog.height=5;
	jimmaysDog.age=12;
	jimmaysDog.gender='M';
	
	
	
	System.out.println("My Dog Name is " +jimmaysDog.name);
	System.out.println("His Breed is " +jimmaysDog.breed);
	System.out.println("His color is " +jimmaysDog.colors);
	
	;
	
	}

}
