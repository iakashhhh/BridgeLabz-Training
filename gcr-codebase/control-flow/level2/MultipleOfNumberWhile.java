import java.util.Scanner;
public class MultipleOfNumberWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter The an number: ");
        int number = input.nextInt();

        // while loop start 
        if(number>0 && number<100){
            int counter = number-1; 
            while(counter>1) {
                // Check if the number perfectly divisible by  i
                if (number % counter == 0) {
                    System.out.println("Multiples of " + number + " below 100 are:");
                    System.out.println(counter);
                }
                counter--;
            }

         }
         else{
            System.out.println("Invalid number ");
         }
            input.close();

	}
}