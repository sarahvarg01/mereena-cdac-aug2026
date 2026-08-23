/* Print all numbers in multiple of 3 between 1 to N */
import java.util.*;
public class quest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    
}
