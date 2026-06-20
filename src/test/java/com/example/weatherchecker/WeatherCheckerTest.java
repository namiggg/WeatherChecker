package com.example.weatherchecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeatherCheckerTest {

    @Test
    void soyuqHavadaPaltoMesaji() {
        WeatherChecker checker = new WeatherChecker();
        assertEquals("Soyuqdur, palto gey!", checker.check(5));
    }

    @Test
    void istiHavadaNormalMesaj() {
        WeatherChecker checker = new WeatherChecker();
        assertEquals("Normal hava.", checker.check(25));
    }
}
