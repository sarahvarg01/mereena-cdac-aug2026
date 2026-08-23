/* Question 27: String Literal and Object Creation  */
public class quest27 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";

        if (str1 == str2) {
            System.out.println("Both variables point to the same object.");
        } else {
            System.out.println("Both variables point to different objects.");
        }
    }
}
