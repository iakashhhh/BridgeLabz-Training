import java.util.*;
public class CompareString{
	static boolean isEqual(String str1, String str2){
		if(str1.length() != str2.length()) return false;

		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i))return false;
		}
		return true;
	} 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1 = input.next();
		System.out.print("Enter string 2: ");
		String str2 = input.next();

		boolean check = str1.equals(str2);

		//call isEqual method and check its result with defaulf method
		boolean checkMy = isEqual(str1, str2);

		//print result
		if(check && checkMy){
			System.out.println("String are equal and both methods giving same output ");
		}
		else{
			if(check || checkMy){
				System.out.println("String are equal but both method giving diff output ");
			}
			else{
				System.out.println("String are not equal, both methods giving same result");
			}
		}
	}
}