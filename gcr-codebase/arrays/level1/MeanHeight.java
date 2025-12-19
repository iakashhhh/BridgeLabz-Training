import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
	

        Scanner input = new Scanner(System.in);

        
        // Define an integer array to store the height of players
        double[] playerHeight = new double[11];
        double sum = 0.0;

        // takeing height input from user
        System.out.println("Enter the height of players: ");
        for (int i = 0; i <= playerHeight.length-1; i++) {
            System.out.print("Enter Player " + (i + 1) + " height : ");
            playerHeight[i] = input.nextDouble();
            sum += playerHeight[i]; //adding player height to sum     
        }
        // Calculate mean height
         double mean = sum/11;
         System.out.println("The mean height of the football team is: "+ mean +" cm");
        input.close();
    }
}