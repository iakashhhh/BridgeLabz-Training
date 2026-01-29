package com.lambdaexpressions.hospitalnotification;

class Alert {
    String message;
    String type;   // CRITICAL, INFO, REMINDER

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}
