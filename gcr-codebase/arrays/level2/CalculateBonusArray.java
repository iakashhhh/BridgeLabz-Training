import java.util.Scanner;
public class CalculateBonusArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        // array for storing salary
        System.out.println("Enter your salary: ");
        double[] salary = new double[10];

        // array for storing years
        double[] years = new double[10];

        // array for storing new salary after bonus
        double[] newSalary = new double[10];

        // array for storing bonus
        double[] bonus = new double[10];

        // variable for storing total bonus, old and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        //
        for(int i=0; i<10; i++){
            System.out.print("Enter salary of employee "+(i+1)+":");
            salary[i] = input.nextDouble();

            while(salary[i] <= 0){
                System.out.println("Please enter a valid salary");
                salary[i] = input.nextDouble();
            }

            System.out.print("Enter years of service of employee "+(i+1)+":");
            years[i] = input.nextDouble();

            //checking if the user input the valid or invalid years
            while(years[i] <= 0){
                System.out.println("Please enter a valid year");
                years[i] = input.nextDouble();
            }
        }

        // again running loop to calculate bonus of the employees
        for(int i = 0; i < 10; i++){
        
            //calculating for employees whose service is more than 5 years
            if(years[i] > 5){
                bonus[i] = salary[i] * 0.05;
            }
            
            // 2% if years less than 5 years
            else{
                bonus[i] = salary[i] * 0.02;
            }
            
            //calculating the new salary of employee
                newSalary[i] = salary[i] + bonus[i];
                
            //not calculate the totalOldSalary, totalBonus and total new salary
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            
        }
        // print result
        System.out.println("Total bonus given to employees: "+ totalBonus +"\nTotal old Salary: "+ totalOldSalary + "\n Total new Salary: "+totalNewSalary);
        
		
        input.close();
	}
}