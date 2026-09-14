/* 2. Write a Java program to sort an numeric array. The size of the array will be taken from the user, 
specifies the size all the elements of the array will be taken as input and the arryay will be sorted. */

import java.util.*;

public class quest2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");   // enter the size 
        int size = sc.nextInt();

        int arr[] = new int[size];    // declartion of array
        
        // we are taking input of the array
        for(int i = 0; i < arr.length; i++){  
            arr[i] = sc.nextInt();     
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //Sorting of array started

        for(int i = 0; i < size - 1; i++){      // which element i am working on
            for(int j = 0; j < size - 1 - i; j++){             // which element i am working with
                if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                }
            }
    
        }
              // Display sorted array
        System.out.println("Sorted array:");

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}