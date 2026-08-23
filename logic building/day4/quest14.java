/* Question 14: Find the Index of an Element in an Array */
import java.util.*;
public class quest14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int searchNum = sc.nextInt();

        Arrays.sort(arr); // binarySearch requires a sorted array
        int index = Arrays.binarySearch(arr, searchNum);

        if (index >= 0) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Not Found");
        }
        sc.close();
    }
}
