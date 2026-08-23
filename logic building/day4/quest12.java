/* Question 12: Sort an Array in Ascending Order */

import java.util.Arrays;
import java.util.Scanner;
public class quest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("The sorted array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
