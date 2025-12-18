import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Ask user for the countdown starting number
        System.out.print("Enter the countdown number: ");
        int counter = input.nextInt();

        // for-loop to count down from counter to 1
        for (int i = counter; i >= 1; i--) {
            // Print current countdown value
            System.out.println(i);
        }

        // Print launch message after countdown completes
        System.out.println("Launch");

        // Close the Scanner object
        input.close();
    }
}
