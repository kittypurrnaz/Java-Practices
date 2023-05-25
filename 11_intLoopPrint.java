package lesson02;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        int num = 0;
        int countNum = 0;
        int i = 0;

        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num = kb.nextInt();
        
        for(i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}