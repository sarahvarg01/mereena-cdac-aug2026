/* Problem 5: Print Multiplication Table (Using for Loop) by methods
to multiply we use n * i -- n we have to input
  and i will go on increasing 
*/
import java.util.*;

public class multiplication{
    static void printMultiplicationTable(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n * i );
        }
    }

        public static void main(String[] args){
            printMultiplicationTable(); 
        }
    
}
