package lesson02;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        
        int codeCount = 0;
        String code = " ";
        
        Scanner kb = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter string code: ");
            code = kb.next();
            
            if(code.equals("q")) {
                break;
            }
                    codeCount++;
        }
        System.out.println("Number of code enter is: " + codeCount);
    }
}
