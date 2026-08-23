/*Problem Statement: 
Write a Java program that uses a for-each loop to calculate the sum of all elements in a given integer 
array. The program should ask the user to input 5 integers, store them in an array, and then compute the 
sum of these numbers using the for-each loop */

import java.util.Scanner;
public class quest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
