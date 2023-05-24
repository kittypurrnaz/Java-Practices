package lesson02;
import java.util.*;
/**
 * Lab Practice 
 * Author: Nur Nazifa Sarah Binte Ahmad 
 * Student No: 35012276 
 * Last Changed: May 22, 2023
 */

public class Practice {
    
    public static void main(String[] args) {
        int age = 0, vO2M = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = kb.nextInt();
        System.out.println("Enter VO2M: ");
        vO2M = kb.nextInt(); 
        if(age >= 18 && age <= 25 && vO2M >= 30 && vO2M <= 40) {
            System.out.println("Valid for participation. ");

        }
        else {
            System.out.println("Invalid for participation.");
        }
    }
}