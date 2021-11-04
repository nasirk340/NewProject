package JavaClass6;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char country='a';
		String description;
		switch (country) {
		case 'a':
		description="afghanistan";
		break;
		
		case 'k':
			description="kabob";
		 break;
		 
		case'y':
			description="yami";
			break;
			
			default:
				description="wow";
				
		}
	System.out.println(country +" means "+description);
	}

}
