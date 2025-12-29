// "the user chooses a secret number btw 1-100" write a program to guess it using do while.
import java.util.*;
public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 5;
		int low = 1;
		int high = 100;
		int guessCount = 1;
		String feedback;

		// use do while loop to guess it
		 do{
			int guessNum = (int)(Math.random() * (high - low + 1)) + low;
			System.out.println("Guessed number: " + guessNum);

			//if guessed num is high to range kam karo
			System.out.println("Enter Feedback: 'high' 'low' 'correct' ");
			feedback = sc.nextLine().toLowerCase();
			if(feedback.equals("high")){
				high = guessNum - 1;
				guessCount++;

			}
			// guessed num chhota h to low ko update karo
			else if(feedback.equals("low")){
				low = guessNum + 1;
				guessCount++;
			}
			// correct guess kiya
			else if(feedback.equals("correct")){
				System.out.println("Yayyy! Guessed correct");
				break;
			}

		}
		while(!feedback.equals("correct") && guessCount < count);

		System.out.println("Too many invalid guesses: ");
	
	}
}