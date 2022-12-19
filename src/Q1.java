import java.util.Scanner;
public class Q1
{
    public static void main(final String[] args)throws Exception
    {
        Scanner kb = new Scanner(System.in);
        double weight, delivery_charge = 0;
        String msg = "";

        System.out.print("Enter weight : "); //prompt
        weight = kb.nextDouble();

        while(weight != 0)
        {
            //System.out.print("Enter weight value or enter 0 to stop : ");
            //weight = kb.nextDouble();


            if(weight >= 0 && weight <= 3)
            {
                delivery_charge = 8;
                System.out.printf("Delivery charge : %.2f \n", delivery_charge);

            }
            else if(weight >= 3 && weight <=5)
            {
                delivery_charge = 12;
                System.out.printf("Delivery charge : %.2f \n", delivery_charge);

            }
            else if(weight >= 5 && weight <=25)
            {
                delivery_charge = 12 + ((weight-5)*1.5);
                System.out.printf("Delivery charge : %.2f \n", delivery_charge);

            }
            else
            {
                msg = "invalid";
                System.out.println(msg);

            }
            System.out.print("Enter weight or enter 0 to stop : ");
            weight = kb.nextDouble();
        }
        System.out.println("================================");
        System.out.println("Algorithm Terminated!");
    }

}

