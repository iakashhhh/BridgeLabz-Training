import java.util.Scanner;
public class VoteOrNot{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	//taking age input from the user
	int age = input.nextInt();

	//check if age is more than 18 or not
	if(age>=18){
		System.out.println("The person's age is " + age + " and can vote");
	}

	//age less than 18 can not vote
	else{
		System.out.println("The person's age is " + age + " and can't vote");
	}

	}
}