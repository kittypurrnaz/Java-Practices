package lesson02;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        String nextWord = " ", nextWordUp = " ";
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        nextWord = kb.next();
        nextWordUp = nextWord.toUpperCase();
        
        if(nextWordUp.compareTo("N") < 0) {
            System.out.println("First half of the alphabet.");
        }
        else {
            System.out.println("Second half of the alphabet.");
        }
    }
}


