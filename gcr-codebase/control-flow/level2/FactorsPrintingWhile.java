import java.util.Scanner;

public class FactorsPrintingWhile {
    public static void main(String[] args) {
        // Declaring a Scanner class
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop to find the factors and printing them
        int i=1;
        while(i<=number) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        // Closing scanner
        input.close();
	}
}