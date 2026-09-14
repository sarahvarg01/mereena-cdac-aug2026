
/* 2. using for loops write a Java Program to display all even 
numbers from 1 to 500 */

public class question2{
    public static void main(String[] args){
        for(int temp = 1; temp <=500; temp++){
            if(temp % 2 == 0){
            System.out.println(temp);
            }
        }
    }
}