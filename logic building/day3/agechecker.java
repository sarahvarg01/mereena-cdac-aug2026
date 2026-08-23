/* Write a Java program that includes a method to check the age category. */

import java.util.*;
public class agechecker {
    static void ageCategory(int age){
        if(age <= 18){
            System.out.println("You are a minor");
        }
        else if(age <= 60){
            System.out.println("You are a adult");
        }
        else{
            System.out.println("You are a senior citizen");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        
        ageCategory(age);

    }
    
}
