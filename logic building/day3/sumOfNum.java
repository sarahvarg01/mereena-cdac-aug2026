/* Write a java program using method to calculate sum of 2 numbers */

import java.util.*;

public class sumOfNum{

    static int sumOfTwoNumbers(int a, int b){
        return a + b;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b= sc.nextInt();

        int sum = sumOfTwoNumbers(a, b);
        System.out.println("Sum of number is " + sum);


    }
}