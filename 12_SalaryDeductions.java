package lesson02;

package lesson02;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        double salary = 0, deductions = 0, net = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        salary = kb.nextDouble();
        System.out.println("Enter your deductions: ");
        deductions = kb.nextDouble();
        
        System.out.printf("Your salary is %.2f \n", salary);
        System.out.printf("Your deductions are %.2f \n", deductions); 
        
        if(salary >= deductions) {
            net = salary - deductions;
            System.out.printf("net: %.2f\n", net);
            System.out.println("OK.");
        }
        else if(salary < deductions) {
            System.out.println("No way");
        }
    }
}
