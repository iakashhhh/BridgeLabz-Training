import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        // marks[i][0] -> Physics, marks[i][1] -> Chemistry, marks[i][2] -> Maths
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student and calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            int p = input.nextInt();
            int c = input.nextInt();
            int m = input.nextInt();
            //if the marks are negative, ask the user to enter marks again
            if(p<0 || c<0 || m<0){
                i--;
                continue; // restart loop for this i only
            }
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;


            // Calculate the total marks and percentage for the student
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;

            // Determine the grade based on the percentage
            if (percentages[i] >= 90) {
                grades[i] = "Grade A";
            } else if (percentages[i] >= 70) {
                grades[i] = "Grade B";
            } else if (percentages[i] >= 50) {
                grades[i] = "Grade C";
            } else if (percentages[i] >= 35) {
                grades[i] = "Grade D";
            } else {
                grades[i] = "Grade F";
            }
        }

        // Display the marks, percentages, and grades for each student
       // System.out.printf( "Student", "Physics", "Chemistry", "Maths", "Grade");

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student "+(i + 1)+ ":- Physics: " + marks[i][0]+ ", Chemistry: "+ marks[i][1] + ", Maths: "+ marks[i][2] +", "+ grades[i]);
        }
        // Close the scanner
        input.close();
	}
}