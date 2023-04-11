import java.util.Scanner;
public class Q1_sarah
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String date;
        int month, day, year;
        
        System.out.print("Enter the date in MM/DD/YYYY format : ");
        // 1. user will input the date
        date = kb.next();
        String[] array = date.split("/");
        // 2. this will split MM/DD/YYYY into arrays of 0, 1, 2 respectively.
        month = Integer.parseInt(array[0]);
        // 3. it will take a string integer and convert it to zero.
        day = Integer.parseInt(array[1]);
        // 4. same as step 2
        year = Integer.parseInt(array[2]);
        // 5. same as step 2
        
        if(month<1 || month>12)
        {
            System.out.println("=====================================");
            System.out.println("Date is invalid! ");
            System.out.println("Month must be within the range of 1 to 12.");
        }
        else if(day<1 || day>31)
        {
            System.out.println("=====================================");
            System.out.println("Date is invalid! ");
            System.out.println("Day must be within the range 1 to 31.");
        }
        else if(year<1000 || year>9999)
        {
            System.out.println("=====================================");
            System.out.println("Date is invalid! ");
            System.out.println("Year must be in 4 digits.");
        }
        else if((month == 4 || month == 6 || month == 9 || month == 11) && (day>30))
        //if they enter any of this month and the day is greater than 30.
        {
            System.out.println("=====================================");
            System.out.println("Date is invalid! ");
            System.out.println("This month has only 30 days.");
        }
        //if month == 2, include the leap year calculation. 
        //leap year formula comes next. take note of modulus.
        else if ((month == 2) && (day > 29))
        {
            System.out.println("=====================================");
            System.out.println("Date is invalid!");
            System.out.println("February in " + year + " has only 28 or 29 days.");
        }         
        else if ((month == 2) && (day <= 28) && (LeapYear(year) == false))
        {
            System.out.println("=====================================");
            System.out.println("Date is valid!");
            System.out.println("February in " + year + " has only 28 days and is not a leap year.");
        }   
        else if ((month == 2) && (day <= 29) && (LeapYear(year) == true))
        {
            System.out.println("=====================================");
            System.out.println("Date is valid!");
            System.out.println("February in " + year + " has only 29 days and is a leap year.");
        }               
        else
        {
            System.out.println("Date is valid!");
        }
    }
    public static boolean LeapYear(int year) 
    // LeapYear is the method name
    {
        //int result
        if(year % 4 == 0) 
        {
            if(year % 100 !=0)
            {
                return true;
            }
            return (year % 400 == 0);
        }
        return false;    
    }
    //in a special method, there is no written type for the constructor, ex, public static

}