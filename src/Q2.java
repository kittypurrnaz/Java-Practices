import java.util.Scanner;
public class Q2
{
    public static void main(final String[] args)throws Exception
    {
        Scanner kb = new Scanner(System.in);
        double price, bsd = 0;
        String property;
        String residential;
        String nonResidential;
        String msg = "";

        System.out.println("[residential/nonResidential]");
        System.out.println("================================");
        System.out.print("Enter property : "); //prompt
        property = kb.nextLine();
        System.out.println("================================");
        System.out.print("Enter price : "); //prompt
        price = kb.nextInt();
        System.out.println("================================");

        if(property.equalsIgnoreCase("residential"))
        {
            if(price >= 0 && price <= 180000)
            {
                bsd = price * 0.01;
            }
            else if(price >= 180000 && price <= 600000)
            {
                bsd = price * 0.02;
            }
            else if(price > 600000)
            {
                bsd = price * 0.03;
            }
            else
            {
                msg = "Invalid price!";
            }
        }
        else if(property.equalsIgnoreCase("nonResidential"))
        {
            if(price >= 0 && price <= 180000)
            {
                bsd = price * 0.015;
            }
            else if(price >= 0 && price <=600000)
            {
                bsd = price * 0.025;
            }
            else if(price > 600000)
            {
                bsd = price * 0.035;
            }
            else
            {
                msg = "Invalid price!";
            }
        }
        else
        {
            msg = "Invalid property!";
        }

        System.out.printf("Value of the Buyer's Stamp Duty is $%.2f \n", bsd);
        System.out.println("================================");
        System.out.println(msg);
    }
}
