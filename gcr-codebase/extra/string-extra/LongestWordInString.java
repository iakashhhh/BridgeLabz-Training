import java.util.*;
public class LongestWordInString{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputText = input.nextLine();

		String[] words = inputText.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Sentence: " + inputText);
        System.out.println("Longest Word: " + longestWord);

	}
}