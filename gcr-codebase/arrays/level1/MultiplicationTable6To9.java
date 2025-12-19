import java.util.Scanner;
public class MultiplicationTable6To9 {
    public static void main(String[] args) {
	

        Scanner input = new Scanner(System.in);

        // taking an integer as input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an integer array to store the results of multiplication
        int[] multiTable = new int[4];

        //using loop to calculate multiplication 
        for (int i = 6; i <=9; i++) {
            multiTable[i-6] = number * i ;      
        }
        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 6; i <=9; i++) {
            System.out.println(number + " * " + i + " = " + multiTable[i-6]);
        }
        input.close();
    }
}