/* 1. Find average marks of students and give grades accordingly */

public class avgofstudent{
    public static void main(String[] args){
        int maths = 80;
        int science = 85;
        int history = 90;
        int average = (maths + science + history)/3;
        
        System.out.println(average +" is the average.");

        if(average >=90){
            System.out.println("Grade A");
        }
        else if(average > 70 && average < 90){
            System.out.println("Grade B");
        }
        else if(average > 50 && average <= 70){
            System.out.println("Grade C");
        }
        else if(average > 30 && average <= 50){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}