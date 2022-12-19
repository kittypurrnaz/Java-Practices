import java.util.Scanner;
import java.io.*;
public class Q3
{
    public static void main(final String[] args)throws Exception

    {
        Scanner reader = new Scanner(new File("..\\ICS_Assignment\\build\\Employee.txt"));
        Scanner percent = new Scanner(System.in);
        int id, salary, salePerf;
        double bonus;
        String name;
        String msg;



        while(reader.hasNext()) //NOT EOF
        {
            id = reader.nextInt();
            name = reader.next();
            salary = reader.nextInt();
            bonus = 0;
            msg = "";

            System.out.printf("%d \t %10s \t %10d \t %10s \n", id, name, salary, msg);
            System.out.println("====================================");

            System.out.print("Enter sale performance in % : "); //prompt
            salePerf = percent.nextInt();
            System.out.println("====================================");
            if(salePerf > 100)
            {
                bonus = (salary * (salePerf/100)/200);
                System.out.printf("Employee %d's bonus is $%.2f \n", id, bonus);

                System.out.println("====================================");
            }
            else
            {
                msg = "No Bonus For This Employee!";
                System.out.println(msg);
                System.out.println("==================================");

            }

        }

    }
}