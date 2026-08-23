/*  Calculate the Sum of Numbers from 1 to N (Using for Loop) 
      Enter a input --> sum = 0 --> i will use to increase with help of loop*/

import java.util.*;

public class sumUsingLoops {
    static void calculateSum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();

        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args){
        calculateSum();
    }
    
}
