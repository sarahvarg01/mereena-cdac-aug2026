import java.util.Scanner;
public class Program
{
    public static void main(String[] args)
    {
        Date objDate = new Date();

        int choice;

        do
        {
            System.out.println();
            System.out.println("******** DATE MENU ********");
            System.out.println("1. Set Data");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates");
            System.out.println("7. Exit");
            System.out.println("***************************");

            System.out.print("Enter your choice: ");
            choice = ConsoleInput.getInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter day: ");
                    int day = ConsoleInput.getInt();

                    System.out.print("Enter month: ");
                    int month = ConsoleInput.getInt();

                    System.out.print("Enter year: ");
                    int year = ConsoleInput.getInt();

                    objDate.setDate(day, month, year);

                    System.out.println("Date set successfully.");
                    break;

                case 2:
                    System.out.print("Enter number of days to add: ");
                    int days = ConsoleInput.getInt();

                    objDate.addDays(days);

                    System.out.println("Days added successfully.");
                    break;

                case 3:
                    System.out.print("Enter number of months to add: ");
                    int months = ConsoleInput.getInt();

                    objDate.addMonths(months);

                    System.out.println("Months added successfully.");
                    break;

                case 4:
                    System.out.print("Enter number of years to add: ");
                    int years = ConsoleInput.getInt();

                    objDate.addYears(years);

                    System.out.println("Years added successfully.");
                    break;

                case 5:
                    System.out.println("Date = " +
                        objDate.getDay() + "/" +
                        objDate.getMonth() + "/" +
                        objDate.getYear());
                    break;

                case 6:
                    System.out.println("Enter second date");

                    System.out.print("Enter day: ");
                    int day2 = ConsoleInput.getInt();

                    System.out.print("Enter month: ");
                    int month2 = ConsoleInput.getInt();

                    System.out.print("Enter year: ");
                    int year2 = ConsoleInput.getInt();

                    Date objDate2 = new Date();

                    objDate2.setDate(day2, month2, year2);

                    if(objDate.getYear() == objDate2.getYear() &&
                       objDate.getMonth() == objDate2.getMonth() &&
                       objDate.getDay() == objDate2.getDay())
                    {
                        System.out.println("Both dates are equal.");
                    }
                    else if(objDate.compareDate(objDate2))
                    {
                        System.out.println("First date is greater.");
                    }
                    else
                    {
                        System.out.println("Second date is greater.");
                    }

                    break;

                case 7:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 7);
    }
}
