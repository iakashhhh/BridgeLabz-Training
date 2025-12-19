import java.util.Scanner;
public class HarshadNumberChecker{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter an integer ");
	int number = input.nextInt();

	int originalNumber = number;

	int sum = 0;

	while(number > 0){
		int digit = number % 10;;
		sum += digit;
		number /= 10;
		}

		//check it sum divide the original num or not
		if(originalNumber % sum == 0){
		 System.out.println(originalNumber + " is a Harshad Number.");
		}
		else{
		System.out.println(originalNumber + " is not a Harshad Number.");
		}
	}
}