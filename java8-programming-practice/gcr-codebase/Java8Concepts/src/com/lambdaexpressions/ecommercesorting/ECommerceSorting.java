package com.lambdaexpressions.ecommercesorting;

import java.util.*;

public class ECommerceSorting {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 80000, 4.6, 10),
                new Product("Phone", 50000, 4.4, 20),
                new Product("Headphones", 3000, 4.8, 30),
                new Product("Smartwatch", 15000, 4.2, 15)
        );

        // Campaign-based sorting using lambdas
        Comparator<Product> sortByPrice =
                (p1, p2) -> Double.compare(p1.price, p2.price);

        Comparator<Product> sortByRating =
                (p1, p2) -> Double.compare(p2.rating, p1.rating);

        Comparator<Product> sortByDiscount =
                (p1, p2) -> Double.compare(p2.discount, p1.discount);

        // Apply sorting dynamically
        Collections.sort(products, sortByPrice);
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        Collections.sort(products, sortByRating);
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        Collections.sort(products, sortByDiscount);
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
