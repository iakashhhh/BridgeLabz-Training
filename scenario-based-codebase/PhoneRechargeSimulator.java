// 10. Phone Recharge Simulator 📱
// Take the user's mobile operator and amount.
// ● Use a switch to display offers.
// ● Loop to allow repeated recharges.
// ● Show balance after each recharge.

import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        char choice;

        do {
            System.out.println("\nEnter Mobile Operator (Jio / Airtel / VI): ");
            String operator = sc.next();

            System.out.println("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            // Switch case for offers
            switch (operator.toLowerCase()) {
                case "jio":
                    System.out.println("Jio Offer: Unlimited calls + 1.5GB/day");
                    break;

                case "airtel":
                    System.out.println("Airtel Offer: Unlimited calls + 2GB/day");
                    break;

                case "vi":
                    System.out.println("VI Offer: Unlimited calls + 1GB/day");
                    break;

                default:
                    System.out.println("Invalid Operator");
                    continue; // skip balance update
            }

            // Update balance
            balance = balance + amount;
            System.out.println("Recharge Successful!");
            System.out.println("Current Balance: ₹" + balance);

            // Repeat option
            System.out.println("\nDo you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator 📱");
        sc.close();
    }
}
