package randomnumberguessinggame;
import java.util.Scanner;

public class Randomnumberguessinggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int attempts = 5;
		
		System.out.println("I have picked a number from 0 to 15. You have to guess the correct numer. \n");
		System.out.println("You have 5 attempts. You will lose 1 attempt for each wrong guess. \n");
		System.out.println("Good luck! \n");
		
		int secretNumber = 0 + (int) (Math.random() * ((15 - 0)) + 1); // generates a range of numbers from 0 to 15
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: \n");
		int guess = scan.nextInt();
		
		while(guess != secretNumber) 
			{
					if (guess < secretNumber) 
					{
						System.out.println("Too low! Try again.");
						attempts--;
						System.out.println("Enter a number: \n");
						guess = scan.nextInt();
						
					}
					
					if (guess > secretNumber)
					{
						System.out.println("Too high! Try again.");
						attempts--;
						System.out.println("Enter a number: \n");
						guess = scan.nextInt();
					}
					
					if (guess == secretNumber)
					{
						System.out.println("Good Job! The correct number is: " + secretNumber);
						scan.close();
						break; // ends if the user guesses the correct number
					}
					
					if(attempts == 0)
					{
						System.out.println("You lose :( \n");
						System.out.println("The random number is actually: " + secretNumber);
						scan.close();
						break; // ends if the user does not guess the correct random number
					}
					
			}
	}
}
