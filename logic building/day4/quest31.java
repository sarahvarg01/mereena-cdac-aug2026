/* Question 31: Multiple String Literals with Same Content  */
public class quest31 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        String str3 = "Hello, World!";

        if (str1 == str2 && str2 == str3) {
            System.out.println("All three strings refer to the same object.");
        } else {
            System.out.println("The strings refer to different objects.");
        }
    }
}
