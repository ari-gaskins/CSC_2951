package inputStream;
import java.util.Scanner;


public class InputStream {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		Scanner inStringStream = null;
		String drinkOrder;
		String drinkType;
		String drinkSyrup;
		String drinkTemp;
		String userInput;
		int numPumps;
		boolean inputDone;
		
		inputDone = false;
		
		// Prompt user for input
		System.out.println("Enter each drink order as follows: ");
		System.out.println("Type Syrup Number of Pumps Hot or Iced");
		System.out.println("Type \"Done\" when order is complete");
		
		while (!inputDone) {
			// get input
			userInput = scnr.nextLine();
			
			inStringStream = new Scanner(userInput);
			
			drinkType = inStringStream.next();
			
			if (drinkType.equals("Done") || drinkType.equals("done")) {
				
				System.out.println("Thank you for completing your order!");
				
				inputDone = true;
				
			} else {
				
				drinkSyrup = inStringStream.next();
				numPumps = inStringStream.nextInt();
				drinkTemp = inStringStream.next();
				drinkOrder = drinkTemp + " " + numPumps + " pump " + drinkSyrup + " " + drinkType;
				
				System.out.println("Your order is: " + drinkOrder);
				System.out.println();
				
			}
		}	
	}
}
