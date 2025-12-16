import java.util.*;
public class PowerCalculation{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter base: ");
	int base = sc.nextInt();

	System.out.println("Enter exponent: ");
	int exponent = sc.nextInt();

	double result = Math.pow(base, exponent);
	System.out.println("Result = " + result);
	}
}