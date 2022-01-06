package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double celcius, fahrenheit;
        int choice;
        do {
            System.out.println("Menu ");
            System.out.println("1. Fahrenheit to Celcius ");
            System.out.println("2. Celcius to Fahrenheit ");
            System.out.println("3. Exit ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit + "(F)" + " = " + fahrenheitToCelcius(fahrenheit) + "(C)");
                    break;
                }
                case 2: {
                    System.out.print("Enter celcius: ");
                    celcius = scanner.nextDouble();
                    System.out.print(celcius + "(C)" + " = " + celciusToFahrenheit(celcius) + "(F)");
                    break;
                }
            }
        } while (choice == 3);
    }

    //Xây dựng phương thức chuyển từ độ C sang độ F
    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    // xây dụng phương thức chuyển từ độ F sang độ C
    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}
