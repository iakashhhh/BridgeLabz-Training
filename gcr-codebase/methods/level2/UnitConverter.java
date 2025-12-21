
import java.util.*;

public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }

    public static double convertMilesToKilometers(double miles) {
        // Convert miles to km
        double miles2km = 1.60934;
        double km = miles * miles2km;

        // return the value
        return km;
    }

    public static double convertMeterToFeet(double meter) {
        // Convert meter to feet
        double meter2feet = 3.28084;
        double feet = meter * meter2feet;

        // return the value
        return feet;
    }

    public static double converFeetToMeter(double feet) {
        // Convert feet to meter
        double feet2meter = 0.3048;
        double meter = feet * feet2meter;

        // return the value
        return meter;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input 
        // km to miles
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        double milesres = convertKmToMiles(km);
        System.out.println("Distance in miles: " + milesres);//result in miles

        // Miles to kilometer
        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();
        double kmres = convertMilesToKilometers(miles);
        System.out.println("Distance in km: " + kmres);//result in km

        // meter to feet
        System.out.print("Enter the distance in meter: ");
        double meter = sc.nextDouble();
        double feetres = convertMeterToFeet(meter);
        System.out.println("Distance in feet: " + feetres);//result in feet

        // feet to meter
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        // Call the method to convert feet to meter
        double meterres = converFeetToMeter(feet);
        // Display value in meter
        System.out.println("Distance in meter: " + meterres);

        //close scanner
        sc.close();
    }
}