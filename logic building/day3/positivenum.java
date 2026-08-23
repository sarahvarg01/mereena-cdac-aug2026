/*Problem 4: User Input for Positive Numbers (Using do-while Loop)
*/

import java.util.*;

public class positivenum{
    static void askForPositiveNumber(){
       Scanner sc = new Scanner(System.in);
       int num;
       do{
            System.out.print("Enter the positive number: ");
            num = sc.nextInt();
       }while(num <= 0);
       System.out.println(" You have entered a positive number");
        }
        public static void main(String[] args){
            askForPositiveNumber();
        }

    
}