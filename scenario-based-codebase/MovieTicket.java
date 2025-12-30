/* 14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.*;
public class MovieTicket {
	public static void print(int count, String movieType, String seatType, char snack){
		System.out.printf(
    "\n+------------------------+\n" +
    "|      MOVIE TICKET      |\n" +
    "+------------------------+\n" +
    "| Count     : %-10d |\n" +
    "| Category  : %-10s |\n" +
    "| Seat Type : %-10s |\n" +
    "| Snacks    : %-10s |\n" +
    "+------------------------+\n",
    count,
    movieType,
    seatType,
    (snack == 'y' ? "Yes" : "No")
);



	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//number of customers
		System.out.println("Enter number of customer: ");
		int num = sc.nextInt();
		int bookedCount = 0;

		int[] silverSeat = {30, 25, 20, 20};
		int[] goldSeat =   {4, 12, 10, 5};


		for(int i=0; i<num; i++){
			// ask for movie type
			System.out.println("\n Enter Movie Category \n Thriller, Comedy, SciFi, Horror");
			String movieType = sc.next().toLowerCase();
			System.out.println("Seat Type: Gold / Silver: ");
			String seatType = sc.next().toLowerCase();
			System.out.println("Number of Tickets: ");
			int count = sc.nextInt();
			System.out.println("Do you want complimentry Snacks: y/n");
			char snack = sc.next().charAt(0);
			
			switch(movieType){
			case "thriller":
				if(seatType.equals("silver")){
					if(count<=silverSeat[0]){
						silverSeat[0] -= count;
						print(count, movieType, seatType, snack);

					}
					else{
						System.out.println("Invalid Quantity! Only " + silverSeat[0] + " Silver Seats left");
					}
				}
				else{
					if(count<=goldSeat[0]){
						goldSeat[0] -= count;
						print(count, movieType, seatType, snack);
					}
					else{
						System.out.println("Invalid Quantity! Only " + goldSeat[0] + " Gold Seats left");
					}

				}
				break;

			case "comedy":
				if(seatType.equals("silver")){
					if(count<=silverSeat[1]){
						silverSeat[1] -= count;
						print(count, movieType, seatType, snack);
					}
					else{
						System.out.println("Invalid Quantity! Only " + silverSeat[1] + " Silver Seats left");
					}
				}
				else{
					if(count<=goldSeat[1]){
						goldSeat[1] -= count;
						print(count, movieType, seatType, snack);
					}
					else{
						System.out.println("Invalid Quantity! Only " + goldSeat[1] + " Gold Seats left");
					}

				}
				break;

			case "scifi":
				if(seatType.equals("silver")){
					if(count<=silverSeat[2]){
						silverSeat[2] -= count;
						print(count, movieType, seatType, snack);
					}
					else{
						System.out.println("Invalid Quantity! Only " + silverSeat[2] + " Silver Seats left");
					}
				}
				else{
					if(count<=goldSeat[2]){
						goldSeat[2] -= count;
						print(count, movieType, seatType, snack);
					}
					else{
						System.out.println("Invalid Quantity! Only " + goldSeat[2] + " Gold Seats left");
					}

				}
				break;

			case "horror":
				if(seatType.equals("silver")){
					if(count<=silverSeat[3]){
						silverSeat[3] -= count;
						print(count, movieType, seatType, snack);
					}
					else{
						System.out.println("Invalid Quantity! Only " + silverSeat[3] + " Silver Seats left");
					}
				}
				else{
					if(count<=goldSeat[3]){
						goldSeat[3] -= count;
						print(count, movieType, seatType, snack);
					}
					else{
						System.out.println("Invalid Quantity! Only " + goldSeat[3] + " Gold Seats left");
					}

				}
				break;
			// default:
			// 	System.out.println("Invalid Input");
			// 	continue;

			}
		}

	}
}