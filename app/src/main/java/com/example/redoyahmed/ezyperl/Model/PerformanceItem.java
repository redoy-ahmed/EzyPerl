package com.example.redoyahmed.ezyperl.Model;

public class PerformanceItem {
    private String name;
    private String value;

    public PerformanceItem(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }
}
