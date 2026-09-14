
/* 3. using for loops write a Java Program to display every 7th 
number from 1 to 200 */
public class question3 {
    public static void main(String[]args){
        for(int temp = 1; temp <=200; temp++){
        if(temp % 7 == 0){
            System.out.println(temp);
        }
        }
    }
    
}
