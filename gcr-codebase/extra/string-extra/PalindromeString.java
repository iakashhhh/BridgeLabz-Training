import java.util.*;
public class PalindromeString{
	public static boolean isPalindrome(String inputText){
		int start = 0;
		int end = inputText.length()-1;
		while(start <= end){
			if(inputText.charAt(start++)!=inputText.charAt(end--)) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputText = input.nextLine();
		boolean result = isPalindrome(inputText);
		if(result){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
}