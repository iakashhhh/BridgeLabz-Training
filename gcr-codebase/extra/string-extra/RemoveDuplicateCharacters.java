import java.util.*;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character not already in result, add it
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result);
    }
}
