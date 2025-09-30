package temperatureConverter;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Check if temperature is extreme
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
    // Convert Kelvin to Celsius
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

}

