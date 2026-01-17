package cinema_house;

public class SortMovies {
	public static void bubbleSort(Movie[] movieList, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(movieList[j].time.compareToIgnoreCase(movieList[j+1].time)>0) {
					Movie temp = movieList[j];
					movieList[j] = movieList[j+1];
					movieList[j+1] = temp;
				}
			}
		}
		
	}
		public static void display(Movie[] movieList) {
			System.out.println("Movie: Time");
			for(Movie m : movieList) {
				System.out.print(m.name + " - ");
				System.out.println(m.time);
				
			}
		}
}
