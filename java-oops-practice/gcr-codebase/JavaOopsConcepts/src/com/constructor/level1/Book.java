package com.constructor.level1;

public class Book {
	String title;
	String author;
	double price;
	Book(){
		title = "Atomic Habits";
		author = "Vivek Shilpi";
		price = 5.0;
	}
	// Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

	
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }


}