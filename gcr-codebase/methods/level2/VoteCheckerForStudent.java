import java.util.Scanner;

public class VoteCheckerForStudent {
    
    //method to check eligibility
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
       // VoteCheckerForStudent checker = new VoteCheckerForStudent();
        int[] studentAges = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            if (canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
	
		//close scanner
        input.close();
    }
}