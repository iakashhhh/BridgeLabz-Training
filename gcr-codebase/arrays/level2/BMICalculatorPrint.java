import java.util.Scanner;

public class BMICalculatorPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number of people
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Get input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Input height and weight
            System.out.print("Height (in meters): ");
			
            heights[i] = input.nextDouble();

            System.out.print("Weight (in kilograms): ");
            weights[i] = input.nextDouble();

            // Calculate BMI
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

     
		//printing the output
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + " Height " + heights[i] + " Weight "+ weights[i] + " BMI "+ bmi[i] + " Status "+ weightStatus[i]);
        }
		
		//closing scanner
        input.close();
    }
}