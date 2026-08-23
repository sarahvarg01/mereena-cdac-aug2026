/* Print good morning message if the predefined time is between 5 am to 12 pm */
public class GMmessage {
    public static void main(String[]args){
        int time = 15;

        if(time > 5 && time < 12){
            System.out.println("Good morning");
        }
        else{
            System.out.println("Good Evening");
        }
    }
    
}
