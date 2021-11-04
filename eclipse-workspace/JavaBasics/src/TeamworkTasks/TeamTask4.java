package TeamworkTasks;

public class TeamTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		/*
		 * Create an array of countries. 
		 * While retrieving all values from an array print capital for each country. 
		 * (use 2 different loops).
		 */

		String[] country= {"Kazakhstan","Russia","Turkey","USA"};
		String capital=null;
		for(String c:country) {
			switch (c) {
			case "Kazakhstan":
				capital="Nur-Sultan";
				break;
			case "Russia":
				capital="Moskow";
				break;
			case"Turkey":
				capital="Ankara";
				break;
			case"USA":
				capital="Washington";
				break;
				default:
					capital="Unknown";

			}
			System.out.println("The capital of "+c+" is "+capital);
		}
	}


	}


