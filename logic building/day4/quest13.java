/* Question 13: Check if an Array Contains a Specific Element  */

import java.util.*;
public class quest13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int searchNum = sc.nextInt();

        if (Arrays.asList(arr).contains(searchNum)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        sc.close();
    }
}
