package Lab8Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab8Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Scanner scnr = new Scanner(System.in);
		String wantToKnow;
	       String userContinue = "yes";

	       do {

	           int[] studentNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	           String[] names = {"Adan", "Bryan", "Julio", "Gabriel", "Ludicris", "Mariah", "Lilo", "Stich", "Joey", "Kim",
	                   "George", "Constanza", "Raymond", "Angela", "Julia", "Rufus", "Mary", "Cornelius", "Roger", "Cristos"};
	           String[] hometown = {"Los Angeles", "Detroit", "Mexico", "Chicago", "Detroit", "Texas", "Florida", "Tenesse",
	                   "Wisconsin", "South Carolina", "Colorado", "Arizona", "Los Angeles", "Idaho", "Washington", "Kansas",
	                   "Iowa", "Indiana", "Atlanta", "Nevada"};
	           String[] food = {"Tacos", "Pizza", "Enchiladas", "Hot Dog", "Coneys", "BBQ", "SeaFood", "Chicken", "Cheese",
	                   "Pancakes", "Pitas", "Burritos", "Tacos", "Potato", "Seafood", "BBQ", "Hot Dogs", "Coneys", "Steak",};


	           System.out.println("Welcome to our java class. Which student would you like to learn more about?");

	           System.out.println();

	           for (int i = 0; i < names.length; i++)
	               System.out.println(studentNum[i] + " " + names[i]);


	           int userEntry = getInt("Please enter a number between 1-20", scnr);
	           System.out.println("You chose " + names[userEntry - 1]);

	           System.out.println("Do you wish to keep going?");
	           userContinue = scnr.next();

	           if(userContinue.equalsIgnoreCase("yes")) {
	               System.out.println("Would you like to know about " + names[userEntry - 1] + "'s food or hometown?");
	               String userChoice = scnr.next().toLowerCase();

	               if(userChoice.equalsIgnoreCase("food") || userChoice.equalsIgnoreCase("hometown")) {

	                   switch(userChoice){
	                       case "food":
	                           System.out.println("You have selected " + userChoice + " " + names[userEntry - 1] + " likes " + food[userEntry - 1]);
	                           break;
	                       case "hometown":
	                           System.out.println("You have selected " + userChoice + " " + names[userEntry - 1] + " is from " + hometown[userEntry - 1]);
	                           break;
	                   }
	               }
	           }
	           System.out.println("Would you like to pick another name");
	           userContinue = scnr.next();


	       } while (userContinue.equalsIgnoreCase("yes"));

	       System.out.println();

	       System.out.println("Goodbye");

	       scnr.close();

	   }

	   private static boolean userContinue(boolean b) {
	       // TODO Auto-generated method stub
	       return false;
	   }

	   public static int getInt(String prompt, Scanner scnr) {
	       boolean isValid = false;
	       int num = 0;

	       while (!isValid) {
	           System.out.println(prompt);
	           if (scnr.hasNextInt()) {
	               num = scnr.nextInt();
	               isValid = true;
	           } else {
	               System.out.println("The user does not exist, select another user.");
	               isValid = false;
	           }
	           scnr.nextLine(); 
	       }
	       return num;
	   }
	}