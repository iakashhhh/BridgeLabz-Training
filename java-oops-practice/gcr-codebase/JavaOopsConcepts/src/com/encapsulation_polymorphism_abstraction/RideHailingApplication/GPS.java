package com.encapsulation_polymorphism_abstraction.RideHailingApplication;

public interface GPS {
    String  getCurrentLocation();
    void updateLocation(String newLocation);
}