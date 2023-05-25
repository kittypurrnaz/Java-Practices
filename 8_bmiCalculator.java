package lesson02;

import java.util.*;

/**
 * Author: Nur Nazifa Sarah Binte Ahmad Student No:
 * 35012276 Last Changed: May 22, 2023
 */
public class Practice {

    public static void main(String[] args) {
        double weight = 0, height = 0, bmi = 0;
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your weight & height in this format: ");
        System.out.println("weight: 80kg, height: 1.70cm");
        System.out.println("===========================================");
        System.out.println("Enter weight (kg): ");
        weight = kb.nextDouble();
        System.out.println("Enter height (cm): ");
        height = kb.nextDouble();
        System.out.println();

        // BMI CALCULATIONS
        bmi = weight / (height * height);

        if (bmi >= 0 && bmi <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Invalid BMI");
        }
        System.out.printf("Your BMI is %.2f \n", bmi);
    }
}
