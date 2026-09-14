import java.util.Scanner;
public class Date
{
    private int day;
    private int month;
    private int year;

    public Date()
    {
        day = 1;
        month = 1;
        year = 2026;
    }

    public void setDate(int dd, int mm, int yy)
    {
        year = yy;

        if(mm < 1 || mm > 12)
            month = 1;
        else
            month = mm;

        if(month == 1 || month == 3 || month == 5 ||
           month == 7 || month == 8 || month == 10 ||
           month == 12)
        {
            if(dd < 1 || dd > 31)
                day = 1;
            else
                day = dd;
        }
        else if(month == 4 || month == 6 ||
                month == 9 || month == 11)
        {
            if(dd < 1 || dd > 30)
                day = 1;
            else
                day = dd;
        }
        else
        {
            if(isLeapYear())
            {
                if(dd < 1 || dd > 29)
                    day = 1;
                else
                    day = dd;
            }
            else
            {
                if(dd < 1 || dd > 28)
                    day = 1;
                else
                    day = dd;
            }
        }
    }

    public boolean isLeapYear()
    {
        if(year % 400 == 0)
            return true;
        else if(year % 100 == 0)
            return false;
        else if(year % 4 == 0)
            return true;
        else
            return false;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public int getDaysInMonth()
    {
        if(month == 1 || month == 3 || month == 5 ||
           month == 7 || month == 8 || month == 10 ||
           month == 12)
        {
            return 31;
        }
        else if(month == 4 || month == 6 ||
                month == 9 || month == 11)
        {
            return 30;
        }
        else
        {
            if(isLeapYear())
                return 29;
            else
                return 28;
        }
    }

    public void addDays(int days)
    {
        for(int i = 0; i < days; i++)
        {
            day++;

            if(day > getDaysInMonth())
            {
                day = 1;
                month++;

                if(month > 12)
                {
                    month = 1;
                    year++;
                }
            }
        }
    }

    public void addMonths(int months)
    {
        for(int i = 0; i < months; i++)
        {
            month++;

            if(month > 12)
            {
                month = 1;
                year++;
            }
        }

        if(day > getDaysInMonth())
            day = getDaysInMonth();
    }

    public void addYears(int years)
    {
        year = year + years;

        if(month == 2 && day == 29 && !isLeapYear())
            day = 28;
    }

    public boolean compareDate(Date obj)
    {
        if(year > obj.year)
            return true;
        else if(year < obj.year)
            return false;

        if(month > obj.month)
            return true;
        else if(month < obj.month)
            return false;

        if(day > obj.day)
            return true;
        else
            return false;
    }
}
