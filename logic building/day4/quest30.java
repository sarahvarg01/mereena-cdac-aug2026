/* Question 30: String Pool with intern() Method 
Problem Statement: 
Write a Java program that creates a string using the new keyword and then calls the 
intern() method. Print whether the interned string is pointing to the same object as the 
original string literal */
public class quest30 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!").intern();

        if (str1 == str2) {
            System.out.println("The interned string is pointing to the same object as the original string literal.");
        } else {
            System.out.println("The interned string is pointing to a different object.");
        }
    }
}
