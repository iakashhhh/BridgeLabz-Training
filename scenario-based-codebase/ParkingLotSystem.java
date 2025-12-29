import java.util.*;
public class ParkingLotSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int totalcapacity = 5;
		int occupied = 0;
		while(occupied < totalcapacity){
			System.out.println("Please enter: 'park', 'exit' or showoccupancy' ");
			String input = sc.next().toLowerCase();

			switch(input){
			case "park":
				System.out.println("You have Parked Your Vehicle");
				occupied++;
				break;

			case "showoccupancy":
				System.out.println("Total Parking capacity: " + totalcapacity + " Occupied: " + occupied );
				break;

			case "exit":
				System.out.println("Thanks For Visiting");
				//occupied = totalcapacity;
				//break;
				return;

			default :
				System.out.println("Invalid input");
				continue;
			}
		}
		sc.close();
	}
}