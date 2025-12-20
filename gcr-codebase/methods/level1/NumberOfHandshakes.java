//including scanner package to take input
import java.util.Scanner;
public class NumberOfHandshakes{

static void findTotalHandShake(int numberOfStudents){
	//calculating number of hanshakes am0ong student
		int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		//printing the number of handshakes
		System.out.println("Total number of handshakes among "+ numberOfStudents + " is " + numberOfHandshakes);
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking number of student as input
		System.out.println("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		
		findTotalHandShake(numberOfStudents);
		input.close();
		
	}
}