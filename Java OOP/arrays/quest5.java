import java.util.*;

public class quest5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] copy = new int[n];

        for(int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }

        System.out.println("Copied array:");

        for(int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
