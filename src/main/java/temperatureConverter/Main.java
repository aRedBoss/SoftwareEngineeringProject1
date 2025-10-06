package temperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();

        System.out.print("Enter temperature value: ");
        double temp = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter unit to convert to (C, F, K): ");
        String unit = scanner.nextLine().toUpperCase();

        switch (unit) {
            case "C":
                System.out.println("Celsius: " + converter.fahrenheitToCelsius(temp));
                break;
            case "F":
                System.out.println("Fahrenheit: " + converter.celsiusToFahrenheit(temp));
                break;
            case "K":
                System.out.println("Kelvin: " + (converter.celsiusToFahrenheit(temp) + 273.15));
                break;
            default:
                System.out.println("Unknown unit. Use C, F, or K.");
        }

        scanner.close();
    }
}
