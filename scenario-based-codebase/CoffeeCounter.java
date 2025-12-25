import java.util.Scanner;

public class CoffeeCounter {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		final double gstRate = 0.05; // 5% GST

		while(true) {
			System.out.println("\n Enter coffee type (espresso/latte/cappuccino) or type 'exit' to stop:");
			String coffeeType = input.next().toLowerCase();

			if(coffeeType.equals("exit")) {
				System.out.println("Thank you for visiting!");
				break;
			}

			System.out.print("Enter quantity: ");
			int quantity = input.nextInt();

			double price = 0;

			switch (coffeeType) {
				case "espresso":
					price = 100;
					break;
				case "latte":
					price = 120;
					break;
				case "cappuccino":
					price = 150;
					break;
				default:
					System.out.println("Invalid coffee type!");
					continue; // skip rest and continue loop
			}

			double totalPrice = price * quantity;
			double gstAmount = totalPrice * gstRate;
			double finalBill = totalPrice + gstAmount;

			System.out.println("Total Bill (including GST): " + finalBill);
		}
	}
}