/* Question 10: Find the Average of Elements in an Array 
Problem Statement: 
Write a Java program that asks the user to input 5 integers, stores them in an array, and then calculates and 
prints the average of the elements in the array.  */
import java.util.Scanner;
public class quest10 {
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

        double average = (double) sum / arr.length;
        System.out.println("The average of the array elements is: " + average);
    }
    
}
