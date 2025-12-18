import java.util.Scanner;
public class CheckNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	//taking number input from the user
	int number = input.nextInt();

	//check if num is positive or not
	if(number > 0){
		System.out.println("The number "+ number + " is positive");
	}

	//check if it is negative
	else if(number < 0){
		System.out.println("The number "+ number + " is negative");

	}

	//number is  zero
	else{
		System.out.println("The number is Zero");
	}

	}
}