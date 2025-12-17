import java.util.*;
public class KmtoMiles2{
	public static void main(String[] args){
	 double km;
	 Scanner input = new Scanner(System.in);

	 km = input.nextInt();

	 double miles = km/1.6;

	 System.out.println(
	 "The total miles is " + miles + " for the given " + km + " km");
	}
}