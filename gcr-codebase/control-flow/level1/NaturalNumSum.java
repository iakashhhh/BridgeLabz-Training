import java.util.Scanner;
public class NaturalNumSum{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	//taking input from the user
	int num = input.nextInt();

	//if num is natural then calculate sum and print it
	if(num > 0){
	int sum = num * (num + 1) / 2;
	System.out.println("The sum of " + num + " natural numbers is " + sum);
	} 

	//else num is not natural num
	 else{
		System.out.println("The number " + num + " is not a natural number");
	 }

	}
}