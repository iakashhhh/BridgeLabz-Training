package com.encapsulation_polymorphism_abstraction.LibraryManagementSystem;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}