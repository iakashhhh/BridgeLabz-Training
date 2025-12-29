import java.util.*;
public class StoreDiscount {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of products");

	int num = sc.nextInt();

	double totalBill = 0;
	for(int i=0; i<num; i++){
		System.out.println("Enter the price of " + (i+1) );
		double price = sc.nextDouble();
		totalBill += price;
	}


	System.out.printf("---------Invoice---------%n");

	// discount calculate using if else
	double discount = 0.0;

	if(totalBill > 3000) {
		discount = totalBill * 0.2;
		System.out.println("Total Items Purchased: " + num);
		System.out.println("Total Bill amount: " + totalBill );
		System.out.println("Discounted Bill amount: " + (totalBill - discount) );
		System.out.println("Thanks for Shopping at H&M!");
	}

	else if(totalBill > 1000){
		discount = totalBill * 0.1;
		System.out.println("Total Items Purchased: " + num);
		System.out.println("Total Bill amount: " + totalBill  );
		System.out.println("Discounted Bill amount: " + (totalBill - discount) );
		System.out.println("Thanks for Shopping at H&M! Shop for " + (3000 - totalBill) + " more to get 10+10% extra discount");
	}

	else if(totalBill < 1000) {
		discount = 0;
		System.out.println("Total Items Purchased: " + num);
		System.out.println("Total Bill amount: " + totalBill );
		System.out.println("Discounted Bill amount: " + (totalBill - discount) );
		System.out.println("Thanks for Shopping at H&M! Shop for " + (1000 - totalBill) + " more to get 10% discount");
	}
 }
		
}