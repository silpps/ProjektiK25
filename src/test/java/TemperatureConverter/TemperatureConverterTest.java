package TemperatureConverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {
    TemperatureConverter temperatureConverter;


    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, temperatureConverter.fahrenheitToCelsius(32), 0.1);
        assertEquals(100, temperatureConverter.fahrenheitToCelsius(212), 0.1);
        assertEquals(-40, temperatureConverter.fahrenheitToCelsius(-40), 0.1);

    }

    @Test
    public void testCelsiusToFahrenheit(){
        assertEquals(32, temperatureConverter.celsiusToFahrenheit(0), 0.1);
        assertEquals(212, temperatureConverter.celsiusToFahrenheit(100), 0.1);
        assertEquals(-40, temperatureConverter.celsiusToFahrenheit(-40), 0.1);
    }

    @Test
    public void testIsExtremeTemperature(){
        assertTrue(temperatureConverter.isExtremeTemperature(-41));
        assertTrue(temperatureConverter.isExtremeTemperature(51));
        assertFalse(temperatureConverter.isExtremeTemperature(-40));
        assertFalse(temperatureConverter.isExtremeTemperature(50));
    }

}

//Hilda Hermunen