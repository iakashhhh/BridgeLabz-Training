import java.util.Scanner;
public class RocketLauncher{
	public static void main(String[] args){

	//taking counter value from user
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the countdown number: ");
	int counter = input.nextInt();

	while(counter>=1){
	System.out.println("Value of counter " + counter);
	counter--;
	}

	System.out.println("Launch");
        input.close();
	}
}