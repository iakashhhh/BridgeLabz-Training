import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int marks;
        double average;
        char grade;

        // Input marks using for-loop
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        // Calculate average
        average = total / 5.0;

        // Assign grade category
        int gradeCategory = (int) average / 10;

        // Switch-case for grade assignment
        switch (gradeCategory) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Display result
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
