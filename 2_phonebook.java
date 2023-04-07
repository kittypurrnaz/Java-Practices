import java.util.Scanner;

public class Q2_sarah 
{
    public static void main(String[] args) 
    {
    
        int i = 0, digit = 0;
        String input = "", msg = "";
        char c;
        Scanner kb = new Scanner(System.in);
        
        // 1. prompt for letters
        System.out.print("Enter a telephone number in letter format : ");
        
        // 2. get letters
        input = kb.nextLine().toUpperCase().replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder();
        
        // 3. for-loop
        if (input.isEmpty()) 
        {
        // 4. if user enters a blank
            System.out.println("Invalid input! Do not leave a blank.");
            return;
        }
        else if (input.matches(".*\\d.*"))
        {
        // 5. if user does not enter in letter format
            System.out.println("Invalid input! Please enter in letter format.");
            return;
        }
        else
        {
        // 6. for-loop. the loop starts at i=0.
        for (i = 0; i < Math.min(input.length(), 7); i++) 
        {
            // 7. converted to its corresponding digit using the following formula:  
            c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                digit = (c - 'A') / 3 + 2;
                sb.append(digit);
            } else if (c >= '0' && c <= '9') {
                sb.append(c);
            }
            if (i == 2) {
                sb.append('-');
            }
        }
        }
        // 8. display valid results
        System.out.println("The corresponding telephone number in digits is: " + sb.toString());
    }
}
