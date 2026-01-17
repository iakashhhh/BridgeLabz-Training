package robowarehouse;

import java.util.*;
public class RoboWarehouse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// number of packages
		System.out.println("Enter number of Packages: ");
		int n = sc.nextInt();
		
		Package[] shelf = new Package[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter weight of Package: " + (i+1));
			double weight = sc.nextDouble();
			shelf[i] = new Package(weight);
			
			PackageShelf.insertAndSort(shelf, i+1);
			
			System.out.println("Current Smart Warehouse Shelf:");
			for(int j=0; j<=i; j++) shelf[j].display();
			System.out.println();
		}
	
	}
}
