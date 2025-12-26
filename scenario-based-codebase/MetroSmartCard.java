import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 100; // Initial smart card balance
        double fare;

        while (true) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance travelled (-1 to quit): ");
            int distance = sc.nextInt();

            // Exit condition
            if (distance == -1) {
                break;
            }

            // Fare calculation using ternary operator
            fare = (distance <= 5) ? 10 :
                   (distance <= 15) ? 20 : 30;

            // Check balance
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare ₹" + fare + " deducted.");
            } else {
                System.out.println("Insufficient balance!");
                break;
            }

            // Balance exhausted check
            if (balance == 0) {
                System.out.println("Balance exhausted!");
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro 🚇");
        sc.close();
    }
}
