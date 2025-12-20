import java.util.Scanner;
public class PositiveOrNegative {

 static void checkNumber(int number){
 	//check if num is positive or not
	if(number > 0){
		System.out.println(1);
	}

	//check if it is negative
	else if(number < 0){
		System.out.println(-1);

	}

	//number is  zero
	else{
		System.out.println(0);
	}

 }
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	//taking number input from the user
	System.out.print("Enter a number : ")
	int number = input.nextInt();


	//call function and print ans
	checkNumber(number);
	}
}