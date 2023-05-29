package lesson02;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, max = 0;
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a value for n1: ");
        n1 = kb.nextInt();
        System.out.println("Enter a value for n2: ");
        n2 = kb.nextInt();
        
        System.out.println("=================");
        System.out.println(max = (n1 > n2) ? n1 : n2);
        
    }
}

