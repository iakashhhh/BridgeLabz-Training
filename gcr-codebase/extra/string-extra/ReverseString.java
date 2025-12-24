import java.util.*;
public class ReverseString{
	public static String reverse(String inputText){
		String ans = "";
		int index = inputText.length()-1;
		while(index>=0){
			ans += inputText.charAt(index--);
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		String inputText = input.nextLine();

		System.out.println("Reversed string: " + reverse(inputText));
	}
}