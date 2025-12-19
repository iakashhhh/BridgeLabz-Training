import java.util.Scanner;
public class EvenOddArray {
    public static void main(String[] args) {
	

        Scanner input = new Scanner(System.in);

    // Taking input from user for the number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

    // Checking if the number is a natural or not
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0)");
            return;
        }
        
    // Define two integer array to store the even and odd numbers
        int[] evenNumbers = new int[number/2 + 1];
        int[] oddNumbers = new int[number/2 + 1];

    // index variable for both array
        int evenIndex = 0;
        int oddIndex = 0;

    // Iterate from 1 to the given number to check for even odd
        for (int i = 1; i <= number; i++) {
            if(i%2 == 0){
                evenNumbers[evenIndex++] = i;
            }
            else{
                oddNumbers[oddIndex++] = i;
            }
   
        }
        // Print the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        input.close();
    }
}