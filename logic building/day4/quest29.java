/* Question 29: String Concatenation and Object Creation */
public class quest29 {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";
        String str3 = str1 + str2;

        if (str1 == str3) {
            System.out.println("The concatenated string is a reference to an existing string object.");
        } else {
            System.out.println("The concatenated string is a new object.");
        }
    }
}
