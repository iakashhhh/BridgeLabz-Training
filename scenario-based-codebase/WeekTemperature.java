//11. Temperature Logger 🌡️
//Record temperatures over 7 days.
//● Use array and for-loop.
//● Find average and max temperature.
//● Use if for comparisons. Maintain readable naming and modular code blocks.

import java.util.*;

public class WeekTemperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//create array for storing temperature
		double[] temperature = new double[7];

		double maxTemperature = 0.0;
		double totalTemp = 0.0;

		// take input using for loop and find maxtemp.
		for(int i=0; i<temperature.length; i++){
			System.out.println("Enter Day " + (i+1) + " temperature in °C: ");
			temperature[i] = sc.nextDouble();
			if(temperature[i]>maxTemperature) maxTemperature = temperature[i];
			totalTemp += temperature[i];
		}
		double avgTemperature = totalTemp/7; 	// calculate average

		// print result
		System.out.println("Max Temperature in this week: " + maxTemperature + "°C");
		System.out.printf("Average Temperature throughout week: %.2f°C",avgTemperature);
	}
}

