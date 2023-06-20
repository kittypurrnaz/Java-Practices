package lesson02;

import java.util.*;

/**
 * Lab Practice Week 2: Lab 2 
 * Author: Nur Nazifa Sarah Binte Ahmad 
 * Student No: 35012276 
 * Last Changed: May 22, 2023
 */
public class Q1 {

    public static void run() {
        boolean carryOn = true;
        while (carryOn) {
            char choice = getChoice();
            switch (choice) {
                case 'a': printDetails(); break;
                case 'b': printLargestAndSmallest(); break;
                case 'c': printNumberRange(); break;
                case 'd': isTriangle(); break;
                case 'e': isPrime(); break;
                case 'f': processTenIntegers(); break;
                case 'g': swapFirstAndLastChar(); break;
                case 'q': carryOn = false; break;
                default: System.out.println("Invalid Choice");
            }
        } // while loop closing
    }
    

    public static void swapFirstAndLastChar() {
        
        String s = getStringMax50();
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length()-1);
        String middle = s.substring(1, s.length()-1);
        String newString = lastChar + middle + firstChar;
        System.out.println(newString);
    }
    
    public static String getStringMax50() {
        Scanner kb = new Scanner(System.in);

        boolean carryOn = true;
        String s = "";
        while (carryOn) {
            System.out.print("Enter a string (50 chars max): ");
            s = kb.nextLine();
            if (s.length() <= 50) {
                carryOn = false;
            } else {
                System.out.println("String must be less than 50.");
            }
        }
        return s;
    }
    
    public static void processTenIntegers() {
        int[] tenInts = new int[10];
        for (int i=0; i<tenInts.length;i++) {
        int procTenInt = getInt("Enter number: ");
        tenInts[i] = procTenInt;
        }
        int total = 0;
        int high = tenInts[0];
        int low = tenInts[0];
        for(int i=0; i <tenInts.length; i++) {
            total+=tenInts[i];
            
            if(high<tenInts[i]) {
                high = tenInts[i];
            } 
            if(low>tenInts[i]) {
                low = tenInts[i];
            }
        }
        // int/int => int
        // double/int => double
        // int/double => double
        double ave = (total*1.0)/tenInts.length;
        System.out.println("Total: " +total);
        System.out.println("Average: " +ave);
        System.out.println("Highest number: " +high);
        System.out.println("Lowest number: " +low);
    }

    public static void isPrime() {
        System.out.println("isPrime");
        int n = getInt("Enter an integer for n: ");

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            // Check for divisors from 2 to the square root of n
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false; // Not a prime number
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }


    public static void isTriangle() {
        System.out.println("isTriangle");
        int side1 = getInt("Enter Side 1: ");
        int side2 = getInt("Enter Side 2: ");
        int side3 = getInt("Enter Side 3: ");
        
        boolean c1 = side1 + side2 > side3;
        boolean c2 = side2 + side3 > side1;
        boolean c3 = side1 + side3 > side2;
        
        System.out.println("Side 1: " +side1);
        System.out.println("Side 2: " +side2);
        System.out.println("Side 3: " +side3);
        if(c1 && c2 && c3) {
            System.out.println("Forms a triangle");
        } else {
            System.out.println("Not a triangle");
        }
    }

    public static void printNumberRange() {
        System.out.println("printNumberRange");
        int m = getInt("Enter m: ");
        int n = getInt("Enter n: ");

        int counter = 0;
        int oddSum = 0;
        for (int i = m; i <= n; i++) {

            System.out.print(i + " ");
            counter++;
            if(counter%5==0) {
                System.out.println();
            }
            if(i%2==1) {
                oddSum+=i;
            }
        }
        System.out.println();
        System.out.println("Sum of odd: " +oddSum);
    }

    public static void printLargestAndSmallest() {
        System.out.println("printLargestAndSmallest");
        double x = getDouble("Enter x: ");
        double y = getDouble("Enter y: ");
        double z = getDouble("Enter z: ");
        
        double largest = x;
        if(y>x && y>z) {
            largest = y;          
        } else if(z>x && z>y) {
            largest = z;
        }
        double smallest = x;
        if(y<x && y<z) {
            smallest = y;
        } else if(z<x && z<y) {
            smallest = z;
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }

    public static void printDetails() {
        System.out.println("printDetails");
    }

    public static char getChoice() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter choice(a,b,c,d,e,f,g,q): ");
        char c = kb.nextLine().trim().toLowerCase().charAt(0);
        return c;

    }
    
    public static int getInt(String msg) {
        Scanner kb = new Scanner (System.in);
        System.out.print(msg);
        int n = kb.nextInt();
        return n;
    }
    
    public static double getDouble(String msg) {
        Scanner kb = new Scanner (System.in);
        System.out.print(msg);
        double d = kb.nextDouble();
        return d;
    }
    
    

    public static void main(String[] args) {
        run();
    }
}





















//---------------------------------------------------------------------------
