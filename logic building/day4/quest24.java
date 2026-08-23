/* Question 24: Reverse a String 
Problem Statement: 
Write a Java program that asks the user for a string and then prints the reverse of that 
string.*/
public class quest24 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}
