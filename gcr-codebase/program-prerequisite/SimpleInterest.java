import java.util.*;
public class SimpleInterest{
	public static void main(String[] args){
	double p, r, t, si;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Principal: ");
	p = sc.nextDouble();

	System.out.println("Enter Rate of Interest: ");
	r = sc.nextDouble();

	System.out.println("Enter Time: ");
	t = sc.nextDouble();

	si = (p * r * t) / 100;

	System.out.println("Simple Interest = " + si);
	}
}