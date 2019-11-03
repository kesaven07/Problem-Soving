
package arrays;

import java.util.Scanner;

/*For each array, perform a number of right circular rotations and return the 
value of the element at a given index.

For example, array a={3,4,5} , number of rotations k=2,  and indices to check,m={1,2}
First we perform the two rotations:
1st rotation-{5,3,4}
2nd rotation-{4,5,3}
Now return the values from the zero-based indices 1 and 2  as indicated in the  array.
a[1]=5
a[2]=3*/


public class ArrayRotation {
     static int[] rotate(int[] a ){/*function to rotate array*/

         int[] cr = new int[a.length];
           
            int j=0;
            cr[j]=a[a.length-1];
            for(int x=1;x<a.length;x++)
            {
                cr[x]=a[x-1];
            }
            return cr;
        
           

        }

 
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
         int arr[]=new int[a.length];
         for(int i=0;i<k;i++)
         {
             arr=rotate(a);
             a=arr;
         }
        int result[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)

        {
            result[i]=arr[queries[i]];
            
        }
        return result;
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
          
         System.out.print("Enter no. of rotation:");
         int k = in.nextInt();
          System.out.print("Enter no. of elements you want to query:");
         int m = in.nextInt();
         System.out.println("Enter all the query index:");
         int queries[]= new int[m];
         for(int i=0;i<m;i++)
         {
             queries[i]=in.nextInt();
         }
         
    

}
}
