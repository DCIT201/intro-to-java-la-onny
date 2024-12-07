import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double CelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // While loop to ask user to choose between Celsius to Fahrenheit or Fahrenheit to Celsius conversion
        boolean convert = true;
        while (convert) {
            System.out.print("Enter (1, 2) for the temperature type you want to convert:\n");
            System.out.print("Enter 1 to convert from Fahrenheit to Celsius\n");
            System.out.print("Enter 2 to convert from Celsius to Fahrenheit\n");

            int theTemp = input.nextInt();

            //if condition to tell the program what to do if user chooses either 1 or 2
            if (theTemp == 1) {
                System.out.print("Enter the temperature in Fahrenheit: ");
                double fahrenheit = input.nextDouble();
                double celsius = FahrenheitToCelsius(fahrenheit);
                System.out.printf("The temperature in Celsius is %.2f C%n", celsius);
            } else if (theTemp == 2) {
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = input.nextDouble();
                double fahrenheit = CelsiusToFahrenheit(celsius);
                System.out.printf("The temperature in Fahrenheit is %.2f F%n", fahrenheit);
            } else {
                System.out.print("Try again, enter either 1 or 2\n");
            }

        }

        input.close();
    }
}
