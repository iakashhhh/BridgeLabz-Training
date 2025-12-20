import java.util.Scanner;
public class NumberOfRounds{
 static void countRound(int perimeter){
 	int rounds = 5000/perimeter ;
 	System.out.println("Total number of rounds needed to complete 5km: " + rounds);
 }
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//take three side input from user

		System.out.println("Enter side 1: ");
		int side1 = input.nextInt();
		System.out.println("Enter side 2: ");
		int side2 = input.nextInt();
		System.out.println("Enter side 1: ");
		int side3 = input.nextInt();

		int perimeter = side1+side2+side3;

		//call countround function to fetch rounds
		countRound(perimeter);

	}
}