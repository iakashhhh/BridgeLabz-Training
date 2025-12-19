import java.util.Scanner;
public class CheckNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//create an array of 5 size
		int[] number = new int[5];

		//take input using for loop
		for(int i=0; i<number.length; i++){
			number[i] = input.nextInt();
		}

		//
		for(int i=0; i<number.length; i++){
			if(number[i]<0){
				System.out.println(number[i] + " Number is negative ");
			}
			else if(number[i]==0){
				System.out.println( "Number is Zero");
			}
			else{
				if(number[i]%2 == 0){
					System.out.println(number[i] + " is positive and even");
				}
				else{
					System.out.println(number[i] + " is positive and odd");
				}
				
			}
		}

		// compare first and last number
		if(number[0]==number[4]){
			System.out.println("First nummber "+ number[0] + " and "+ " last number " + number[4] + " are equal");
		}
		else if(number[0]>number[4]){
			System.out.println("First Number " + number[0] + " is greater than last number " + number[4]);
		}
		else{
			System.out.println("First Number " + number[0] + " is smaller than last number " + number[4]);
		}
		input.close();
	}
}