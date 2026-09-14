// 1. Using for loops write a Java Program to display all odd 
// numbers from 1 to 1000

public class question1{
    public static void main(String[]args){
       for(int i = 1; i <=1000; i++){
        if(i % 2 == 1){
            System.out.println(i);
        }
       }
    }
}