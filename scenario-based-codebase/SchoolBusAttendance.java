/* 9. School Bus Attendance System 🚍
Track 10 students' presence.
Use for-each loop on names.
Ask "Present or Absent?"
Print total present and absent counts. */

import java.util.*;

public class SchoolBusAttendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List of 10 students
        String[] students = {
            "Amit", "Pappu", "Rahul", "Mamta", "Vikas",
            "Modi", "Yogi", "Mohan", "Lalu", "Rohan"
        };

        int presentCount = 0;

        // For-each loop to track attendance
        for (String name : students) {
            System.out.print(name + " - Present or Absent? (P/A): ");
            char status = sc.next().toUpperCase().charAt(0);

            if (status == 'P') {
                presentCount++;
            }  else if(status != 'A') {
                System.out.println("Invalid input! Marking as Absent.");
             
            }
        }

        // Attendance summary
        System.out.println("\n Bus Attendance Summary ");
        System.out.println("Total Students : " + students.length);
        System.out.println("Present        : " + presentCount);
        System.out.println("Absent         : " + (students.length - presentCount));
    }
}