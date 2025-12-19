import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
	

        Scanner input = new Scanner(System.in);

        // Define an integer array to store the valid value
        double[] value = new double[10];
        double total = 0.0;
        int index =0;

        while(true){

            double number = input.nextDouble();
            if(number <= 0.0 || index >= 10) {
                break;
            }
            value[index++] = number;
            total += number;

        }
        // print the array by using for loop  
        for(int i=0; i<index; i++){
            System.out.print( value[i] + " ");
            
        }
        //print total value
           System.out.print("\n Total value " + total);


               input.close();
    }
}