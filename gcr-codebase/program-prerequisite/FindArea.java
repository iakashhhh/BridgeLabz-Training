import java.util.*;
public class FindArea{
	public static void main(String[] args){
		double radius, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		radius = sc.nextDouble();
		area = 3.14 * radius * radius;
		System.out.println("Area of circle : " + area);
	}
}