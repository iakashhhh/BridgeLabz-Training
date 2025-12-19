import java.util.Scanner;
public class EligibleForVote{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//create an age array of 10 size
		int[] age = new int[10];
		//take input using for loop
		for(int i=0; i<age.length; i++){
			age[i] = input.nextInt();
		}
		//check using for loop if person can vote or not
		for(int i=0; i<age.length; i++){
			if(age[i]<0){
				System.out.println(age[i] + " Age is invalid ");
			}
			else if(age[i]<18){
				System.out.println( "The student with the age " + age[i] + " cannot vote");
			}
			else{
				System.out.println( "The student with the age " + age[i] + " can vote");
			}
		}
		input.close();
	}
}