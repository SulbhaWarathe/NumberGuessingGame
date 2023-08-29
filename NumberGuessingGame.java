package topper;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int numberToGuess = random.nextInt(100) + 1;
	        int attempts = 0;
	        
	        System.out.println("******Welcome to Guess Number Game!******");
	        System.out.println("You Will Be Asked To Guess a Number To Win The Game.\n You have Maximum 5 attemp limit.\n");

	        while (attempts < 5) 
	        {
	            System.out.print("Enter guess number between 1 and 100 :\n ");
	            int userGuess = scanner.nextInt();
	            attempts++;

	            if (userGuess < numberToGuess) 
	            {
	                System.out.println("Your Guess Number Is Smaller.");
	            } 
	            else if (userGuess > numberToGuess) 
	            {
	                System.out.println("Your Guess Number Is Greater.");
	            } 
	            else 
	            {
	                System.out.println("OOhOO!, YOUR NUMBER IS CORRECT YOU WIN THE GAME! " + attempts + " userGuess.");
	            }
	        }

	        if (attempts==5) 
	        {
	            System.out.println("Sorry, you've run out of attempts. The number was: " + numberToGuess);
	        }

	        scanner.close();
	}

}
