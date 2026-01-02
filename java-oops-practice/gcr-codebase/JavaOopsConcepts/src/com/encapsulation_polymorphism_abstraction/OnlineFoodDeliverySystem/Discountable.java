package com.encapsulation_polymorphism_abstraction.OnlineFoodDeliverySystem;

public interface Discountable {
    String getDiscountDetails();
    double applyDiscount(double discountPercentage);
}