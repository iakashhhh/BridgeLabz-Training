package com.objectmodelling.hospitalmanagement;

public class Doctor {

    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println(
            "Doctor " + name + " is consulting patient " + patient.getName()
        );
    }
}