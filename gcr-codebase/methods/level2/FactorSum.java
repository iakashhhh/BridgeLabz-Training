import java.util.*;
public class FactorSum{
	//method to find factors of number
	public static int[] findFactor(int number){
		int index = 0;
		int count = 0;
		for(int i=1; i<=number; i++){
			if(number%i == 0){
				count++;
			}
		}

		int arr[] = new int[count];
		for(int i=1; i<=number; i++){
			if(number%i == 0){
				arr[index++]=i;
			}
		}
		return arr;
	}

	//method to find sum of factors
	public static int calculateSum(int[] factors){
		int sum = 0;
		for(int i=0; i<factors.length; i++){
			sum+=factors[i];
		}
		return sum;
	}

	//method to find sum of factors
	public static int calculateProduct(int[] factors){
		int product = 1;
		for(int i=0; i<factors.length; i++){
			product*=factors[i];
		}
		return product;
	}

	//create method to calculate sum of squares
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//taking number input from user
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int[] factors = findFactor(number);

		//printing results
		System.out.print("Factors: ");
		for( int factor : factors){
			System.out.print(factor + " ");
		}

		System.out.println("Sum of factors: " + calculateSum(factors));
        System.out.println("Product of factors: " + calculateProduct(factors));
        System.out.println("Sum of squares of factors: " + calculateSumOfSquares(factors));
	}
}