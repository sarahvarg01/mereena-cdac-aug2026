/* Find largest of 3.. input 3 numbers
 if a>b && a>c --> a is largest
 if else b>a && b>c --> b is the largest
 else c is the largest */


 import java.util.*;

 public class largestof3 {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + " is the largest");
        }
        else if(b > a && b > c){
            System.out.println(b + " is the largest");
        }
        else{
            System.out.println(c + " is the largest");
        }
      }
}

