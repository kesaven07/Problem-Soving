
 
package arrays;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/*Given an array arr[] of N integers, the task is to sort the array without changing 
the position of negative numbers (if any) i.e. the negative numbers need not be sorted.
eg: Input: arr[] = {2, -6, -3, 8, 4, 1}
Output: 1 -6 -3 2 4 8 */



public class SortingwithoutchangingNegativePosition {
    static void sortArray(int a[], int n) 
{ 
  
    // Store all non-negative values 
    Vector<Integer> ans = new Vector<>(); 
    for (int i = 0; i < n; i++) 
    { 
        if (a[i] >= 0) 
            ans.add(a[i]); 
    } 
  
    // Sort non-negative values 
    Collections.sort(ans); 
  
    int j = 0; 
    for (int i = 0; i < n; i++) 
    { 
  
        // If current element is non-negative then 
        // update it such that all the 
        // non-negative values are sorted 
        if (a[i] >= 0)  
        { 
            a[i] = ans.get(j); 
            j++; 
        } 
    } 
  
   
    for (int i = 0; i < n; i++) 
        System.out.print(a[i] + " "); 
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
  
    sortArray(arr, n); 
} 
} 
  

