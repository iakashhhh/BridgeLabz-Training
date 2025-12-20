import java.util.Scanner;
public class FrequencyCounter{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
	int number = input.nextInt();

	 // Count the number of digits in the number
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        // Create an array to store digits
        int[] digits = new int[count];

        tempNumber = number;
        int index = 0;

        // Store digits in the array
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber = tempNumber / 10;
            index++;
        }

        int[] frequency = new int[10];

        //count freq of digits 
        for(int i=0; i<digits.length; i++){
        frequency[digits[i]]++;
        }

        //printing frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for(int i=0; i<frequency.length; i++){
        System.out.println("Frequency of " + i + " " + frequency[i]);
        }
	}
}