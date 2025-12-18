import java.util.Scanner;
public class CheckSmallest {
	public static void main(String[] args){
	//create scanner obj
	Scanner input = new Scanner(System.in);
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();

	if((num1 < num2) && (num1 < num3)){
		System.out.println("Is the first number the smallest? Yes" );
	}
	else{
		System.out.println("Is the first number the smallest? No" );
	}
	

	}
}