/* Check positive number 
  take a number if number is more than 0 it is positive*/

import java.util.*;

public class checkpositive{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("It is positive.");
        }
        else{
            System.out.println("It is negative.");
        }
    }
}