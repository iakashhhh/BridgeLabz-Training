package com.lambdaexpressions.hospitalnotification;

import java.util.*;
import java.util.function.Predicate;

public class HospitalAlerts {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Heart rate abnormal", "CRITICAL"),
                new Alert("Appointment tomorrow", "REMINDER"),
                new Alert("New health article available", "INFO"),
                new Alert("Blood pressure high", "CRITICAL")
        );

        // User preferences (filters)
        Predicate<Alert> criticalOnly =
                alert -> alert.type.equals("CRITICAL");

        Predicate<Alert> remindersOnly =
                alert -> alert.type.equals("REMINDER");

        // Apply filtering
        System.out.println("Critical Alerts:");
        alerts.stream()
              .filter(criticalOnly)
              .forEach(System.out::println);

        System.out.println("\nReminder Alerts:");
        alerts.stream()
              .filter(remindersOnly)
              .forEach(System.out::println);
    }
}
