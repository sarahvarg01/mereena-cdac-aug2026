/* Question 28: String Creation with new Keyword */
import java.util.*;
public class quest28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = new String(scanner.nextLine());
        System.out.print("Enter the second string: ");
        String str2 = new String(scanner.nextLine());

        if (str1 == str2) {
            System.out.println("Both objects point to the same reference.");
        } else {
            System.out.println("Both objects point to different references.");
        }
    }
}
