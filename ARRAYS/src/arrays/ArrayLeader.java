
package arrays;

import java.util.Scanner;

 /*An element is leader if it is greater than all the elements to its right side.
 And the rightmost element is always a leader. For example int the 
array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.*/

public class ArrayLeader {
      static void printLeaders(int arr[], int size)  
    { 
        for (int i = 0; i < size; i++)  
        { 
            int j; 
            for (j = i + 1; j < size; j++)   /*It compares the picked element to 
                                               all the elements to its right side.*/ 
                
            { 
                if (arr[i] <= arr[j]) 
                    break; 
            } 
            if (j == size) // the loop didn't break 
                System.out.print(arr[i] + " "); 
        } 
    } 
  
  
    public static void main(String[] args)  
    { 
        
          Scanner in = new Scanner(System.in);
         System.out.print("Enter no. of elements you want in array:");
         int n = in.nextInt();
         System.out.println("Enter all the elements:");
         int arr[]= new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=in.nextInt();
         }
        
        
        printLeaders(arr, n); 
    } 
} 
    

