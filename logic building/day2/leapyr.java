/* 2. Find the leap year*/

import java.util.*;
public class leapyr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }

    
}
