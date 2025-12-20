import java.util.*;
public class SimpleInterestFunction{

// function for calculating simple interest	
  static void calculateSI(double p, double r, double t){
 	double interest = (p * r * t) / 100;
	System.out.println("Simple Interest = " + interest);
 }
	public static void main(String[] args){
	double principal, rate, time;

	Scanner sc = new Scanner(System.in);

	//taking principal as inout
	System.out.println("Enter Principal: ");
	p = sc.nextDouble();

	//taking rate input form user
	System.out.println("Enter Rate of Interest: ");
	r = sc.nextDouble();

	// input time
	System.out.println("Enter Time: ");
	t = sc.nextDouble();

	calculateSI(p,r,t);
	
	}
}