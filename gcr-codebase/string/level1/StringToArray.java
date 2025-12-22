import java.util.Scanner;
public class StringToArray{

// method to print characters
	public static char[] stringToCharArray(String str){
		int n = str.length();
		char[] res1 = new char[n];

		for(int i=0; i<n; i++){
			res1[i] = str.charAt(i);
		}
		return res1;

	}
	public static boolean compareArray(char[] res1, char[] res2){
		if(res1.length != res2.length) return false;
		for(int i=0; i<res1.length; i++){
			if(res1[i] != res2[i]) return false;
		}
		return true;
	}

	public static void main(String[] args){
	
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get first string input from user
		System.out.println("Enter string: ");
		String str = input.next().trim();

		char[] res2 = str.toCharArray();

		char[] res1 = stringToCharArray(str);

		if(compareArray(res1, res2)){
			System.out.println("Both arrays are equal");
		}
		else{
			System.out.println("Both arrays are not equal");
		}
	}
}