import java.util.Scanner;

public class CalculatePowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking input from the user
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        
        // taking power as input from user
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        
        // Initialize the result variable to 1
        int result = 1;
        
        // Loop from 1 to power
        int i=1;
        while (i<=power) {
            result *= number;
            i++;
        }

        // Print the result
        System.out.println("Power "+ power + " of "+ number + " is " +result);
        
        input.close();
    }
}