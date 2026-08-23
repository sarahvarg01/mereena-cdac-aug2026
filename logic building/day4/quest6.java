/*  Problem Statement: 
Write a Java program that uses a for-each loop to print all elements of an integer array. */

import java.util.Scanner;
public class quest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
  
}
