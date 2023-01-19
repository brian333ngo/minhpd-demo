package com.example.demo.enums;

public enum Anomaly {
    MILD("Mild"),
    MODERATE("Moderate"),
    SEVERE("Severe");

    private String value;
    Anomaly(String value) {
        this.value = value;
    }
}