/*
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2 */
public class quest15 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*");
            }
            System.out.println();
        }
    }
    
}
