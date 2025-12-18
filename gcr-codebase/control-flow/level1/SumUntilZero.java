import java.util.Scanner;

public class SumUntilZero{
    public static void main(String[] args){

        // Create Scanner object to take input from user
          Scanner input = new Scanner(System.in);

        // initialise total 0
          double total = 0.0;
        
        // take first input from user
          double number;
          System.out.print("Enter a number (0 to stop): ");
          number = input.nextDouble();

          while(number != 0){
          	total += number;
                System.out.print("Enter a number (0 to stop): ");
                number = input.nextDouble();
          }

          System.out.println("Total value is " + total);
    }
}