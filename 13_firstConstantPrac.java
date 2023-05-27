package lesson02;

import java.util.*;

public class Practice {

    public static final double MIN_SALARY = 30000;
    public static final double MIN_BONUS = 2000;
    public static void main(String[] args) {
        double salary = 0, bonus = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        salary = kb.nextDouble();
        System.out.println("Enter your bonus: ");
        bonus = kb.nextDouble();
        
        if(salary >= MIN_SALARY || bonus >= MIN_BONUS) {
            System.out.println("OK");
        }
        else {
            System.out.println("Too low");
        }
    }
}

