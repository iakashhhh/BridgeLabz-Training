package cinema_house;
import java.util.*;

public class CinemaHouseMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of movies: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Movie[] movieList = new Movie[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter movie Name: ");
			String name = sc.nextLine();
			System.out.println("Enter movie time: ");
			String time = sc.nextLine();
			movieList[i] = new Movie(name, time);
		}
		
		SortMovies.bubbleSort(movieList, n);
		SortMovies.display(movieList);
	}

}
