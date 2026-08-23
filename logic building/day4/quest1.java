/* print numbers from 1 to N */
import java.util.*;
public class quest1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        
    }
}