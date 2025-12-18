import java.util.*;
public class HeightConversion{
	public static void main(String[] args){

	//taking height as input in cm
	Scanner sc = new Scanner(System.in);
	double heightCm = sc.nextInt();

	//converting height to inch 
	double heightInch = heightCm / 2.54;

	//converting height to feet
	double heightFeet = heightInch / 12;

	//printing height
	System.out.println(
	"Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInch);
	}
}