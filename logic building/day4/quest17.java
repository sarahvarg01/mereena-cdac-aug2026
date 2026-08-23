/* 1
1*3
1*3*5
1*3*5*7
1*3*5*7*9 */
public class quest17 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1));
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
