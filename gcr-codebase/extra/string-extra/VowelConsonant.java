import java.util.*;
public class VowelConsonant{
	public static String checkChar(char ch){

	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
		return "vowel";
	}
	else{
		return "consonant";
	}
	}

	public static int[] countVowelConsonant(String str){
		int vowelCount = 0;
		int consonantCount = 0;

		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			String temp = checkChar(ch);

			if(temp.equals("vowel")) vowelCount++;
			else consonantCount++;
		}
		return new int[]{vowelCount, consonantCount};

	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//get first string input from user
		System.out.println("Enter string: ");
		String str = input.next().trim();

		int resultArr[] = countVowelConsonant(str);

		// print result
		System.out.println("Number of vowels: " + resultArr[0]);
		System.out.println("Number of consonant: " + resultArr[1]);
		

	}
}