
package arrays;

import java.util.Scanner;


/*A program to find the sum of contiguous subarray within a one-dimensional
 array of numbers which has the largest sum. eg- array a={-2,-3,4,-2,-1,1,5,-3}
the largest sum ContiguousSubarray is -{4,-2,-1,1,5},Sum=7.*/

public class LargestSumContiguousSubarray {
     static int maxSubArraySum(int a[],int n) 
    { 
        
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
        for (int i = 0; i < n; i++) 
        { 
            /*Each time we get a positive sum Each time we get a positive sum
         compare it with max_so_far and update max_so_far if it is greater than max_so_far*/
                                                               
 
            max_ending_here = max_ending_here + a[i]; 
            if (max_so_far < max_ending_here) 
                 max_so_far = max_ending_here; 
                max_ending_here = 0;           
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        } 
        return max_so_far; 
    }
     public static void main(String[] args){
     Scanner in = new Scanner(System.in);
         System.out.print("Enter no. of elements you want in array:");
         int n = in.nextInt();
         System.out.println("Enter all the elements:");
         int a[]= new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=in.nextInt();
         }
         System.out.println("Maximum contiguous sum is " + 
                                       maxSubArraySum(a,n)); 

}
}