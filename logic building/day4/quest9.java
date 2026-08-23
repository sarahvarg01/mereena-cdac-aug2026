/* Question 9: Find the Largest Element in an Array*/

import java.util.Scanner;
public class quest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
