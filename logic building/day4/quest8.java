/* Question 8: Print All Names in a String Array  */

import java.util.Scanner;
public class quest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[4];

        System.out.println("Enter 4 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("The names in the array are:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}