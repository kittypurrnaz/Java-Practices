package lesson02;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int x1 = 0, x2 = 0;
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a value for x1: ");
        x1 = kb.nextInt();
        System.out.println("Enter a value for x2: ");
        x2 = kb.nextInt();
        
        if(x1 == x2) {
            System.out.println(x1 + " and " + x2 + " are equal.");
        }
        else {
            System.out.println("Continue.");
        }
        
        String x1String = " ", x2String = " ";
        String x1StringUp = " ", x2StringUp = " ";
        
        System.out.println("Enter a string for x1String: ");
        x1String = kb.next();
        System.out.println("Enter the string for x2String: ");
        x2String = kb.next();
        
       // x1StringUp = x1String.toUpperCase();
       // x2StringUp = x2String.toUpperCase();
        
        if(x1StringUp.equalsIgnoreCase(x2StringUp)) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        }
    }
}

