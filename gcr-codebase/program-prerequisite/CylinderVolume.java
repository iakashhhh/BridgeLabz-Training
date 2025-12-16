import java.util.*;
public class CylinderVolume{
	public static void main(String[] args){
		double radius, height, volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		radius = sc.nextDouble();
		System.out.println("Enter height : ");
		height = sc.nextDouble();
		volume = 3.14 * radius * radius * height;
		System.out.println("Volume of cylinder = " + volume);
	}
}