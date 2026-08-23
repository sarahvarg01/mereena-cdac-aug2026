/* Check negative number 
  take a number if number is more than 0 it is negative*/

import java.util.*;
public class checknegative {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int a = sc.nextInt();

    if(a < 0){
        System.out.println("Number is negative");
    }
    else{
        System.out.println("Number is positive");
    }
}   
}
