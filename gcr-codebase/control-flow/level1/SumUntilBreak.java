import java.util.Scanner;

public class SumUntilBreak{
    public static void main(String[] args){

        // Create Scanner object to take input from user
          Scanner input = new Scanner(System.in);

        // initialise total 0
          double total = 0.0;
        
        // take first input from user
          double number;
          System.out.print("Enter a number (0 to stop): ");
          number = input.nextDouble();

          while(true){
          	total += number;
                System.out.print("Enter a number (0 to stop): ");
                number = input.nextDouble();
                
                //check for break condition
                if(number <=0)break;
          }

          System.out.println("Total value is " + total);
    }
}