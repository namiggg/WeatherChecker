package com.example.weatherchecker;

public class WeatherChecker {
    public String check(int celsius) {
        if (celsius < 10) return "Soyuqdur, palto gey!";
        return "Normal hava.";
    }
}
