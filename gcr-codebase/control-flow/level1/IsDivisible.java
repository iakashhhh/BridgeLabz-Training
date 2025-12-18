import java.util.Scanner;
public class IsDivisible {
	public static void main(String[] args){
	//create scanner obj
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();

	//check if number is divisible by 5 or not
	if((num % 5)==0){
	System.out.println("Is the number " + num + " divisible by 5? " + " Yes");
	}
	else{
	System.out.println("Is the number " + num + " divisible by 5? " + "No");
	}

	}
}