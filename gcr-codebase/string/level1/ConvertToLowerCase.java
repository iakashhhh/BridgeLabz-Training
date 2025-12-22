import java.util.Scanner;

public class ConvertToLowerCase{

    // Method for converting each character to lowercase using ASCII values
    public static String convertToLowerCase(String inputText) {
       // StringBuilder lowerCaseText = new StringBuilder();
       String lowerCaseText = "";

        // Looping through each character in the text
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);

            // Checking if the character is uppercase and convert it to lowercase using ASCII values
            if (currentChar >= 'A' && currentChar <= 'Z') {
                lowerCaseText += (char)(currentChar + 32);
            } else {
               lowerCaseText += currentChar; // lowerCaseText.append(currentChar); // If character is already in lowercase
            }
        }

        return lowerCaseText.toString();
    }

    // Method for comparing two strings and return boolean result
    public static boolean compareStrings(String builtInlowerCaseText, String customLowerCaseText) {
		// Compareing the buiktin method text with the user defined lower case version
        return builtInlowerCaseText.equals(customLowerCaseText);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInputText; // Variable to store user input

        // Taking user input
        System.out.print("Enter the text: ");
        userInputText = sc.nextLine();

        // Converting the user input to lowercase using custom method
        String customLowerCaseText = convertToLowerCase(userInputText);

        // Converting the user input to uppercase using the built-in toUpperCase() method
        String builtInlowerCaseText = userInputText.toLowerCase();

        // Comparing the results using the user-defined method
        boolean areEqual = compareStrings(customLowerCaseText, builtInlowerCaseText);

        System.out.println("\nOriginal Text: " + userInputText);
        System.out.println("Uppercase Text (Custom Method): " + customLowerCaseText);
        System.out.println("Uppercase Text (Built-in Method): " + builtInlowerCaseText);
        System.out.println("Are the two uppercase texts equal? " + areEqual);
    }
}