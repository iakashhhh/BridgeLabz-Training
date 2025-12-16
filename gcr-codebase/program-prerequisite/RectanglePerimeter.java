import java.util.*;
public class RectanglePerimeter{
	public static void main(String[] args){
	int length, width, perimeter;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Length: ");
	length = sc.nextInt();

	System.out.println("Enter Width: ");
	width = sc.nextInt();
	
	perimeter = 2 * (length + width);
	System.out.println("Perimeter of Rectangle = " + perimeter);
	}
}