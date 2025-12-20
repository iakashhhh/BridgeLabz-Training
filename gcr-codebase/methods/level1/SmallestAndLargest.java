import java.util.*;
public class SmallestAndLargest{

  // function to check smallest and largest number
	static void findSmallestAndLargest(int num1, int num2, int num3){
		int smallest = num1;
		int largest = num1;

		//check for smallest
		if(num2 < smallest){
		smallest = num2;
		}
		if(num2 > largest){
		largest = num2;
		}

		if(num3 < smallest){
		smallest = num3;
		}
		if(num3 > largest){
		largest = num3;
		}

		//print smallest and largest
		System.out.println("Smallest: " + smallest + " Largest: " + largest);


	}


	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	// take input 3 number
	 System.out.println("Enter number 1: ");
	 int num1 = input.nextInt();
	 System.out.println("Enter number 2: ");
	 int num2 = input.nextInt();
	 System.out.println("Enter number 3: ");
	 int num3 = input.nextInt();

	 findSmallestAndLargest(num1,num2,num3);
	
	}
}