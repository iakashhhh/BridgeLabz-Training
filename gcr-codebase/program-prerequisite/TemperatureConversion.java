import java.util.*;
public class TemperatureConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temp in celsius ");
		int celsius = sc.nextInt();
		int result = (celsius * 9/5) + 32;
		System.out.println("Temp Fahrenheit " + result);
	}
}