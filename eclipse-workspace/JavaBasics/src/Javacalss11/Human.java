package Javacalss11;

public class Human {

	String name;
	int age;
	double height;
	double weight;
	char gender;
	String booltype;
	private String bloodType;
	
	void eat() {
		System.out.println(name+ " eats a lot");
		}
	void sleep() {
		System.out.println(name+ " is sleeping");
		}
	void walk() {
		System.out.println(name+ " with bloodtype "  +getBloodType()+ " is walking ");
	
	
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
}
