import java.util.Scanner;
public class AddNaturalNum{
 
 static void addNumber(int number, int sum){

  while(number>0){
  sum+=number;
  number--;
  }
  
  System.out.print("Sum of N natural number is: " + sum);
 }
	public static void main(String[] args){
     Scanner input = new Scanner(System.in);


     //taking input to find sum of N natural number
     System.out.print("Enter a number: ");
     int number = input.nextInt();
     int sum = 0;

     //call addNumber function 
     addNumber(number, sum);

	}
}