
 
package matrix;

import java.util.Scanner;

/*Given a matrix, the task is to find the maximum element of each row.
Input :  [1, 2, 3]
         [1, 4, 9]
         [76, 34, 21]

Output :
3
9
76 */


public class MatrixMaximum {
    static int max(int column,int[] temp)//normal maximum of array function
    {
        int max=temp[0];
        for(int i=0;i<column;i++)
        {
            if(temp[i]>=max)
            {
                max=temp[i];
            }
        }
        return max;
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row=in.nextInt();
         System.out.println("Enter no of columns:");
        int column=in.nextInt();
        
        int arr[][]=new int[row][column];
          System.out.println("Enter the elements of Matrix:");
          for(int i=0;i<row;i++){
              for(int j=0;j<column;j++){
                  arr[i][j]=in.nextInt();
              }}
         int temp[]=new int[column];
         for(int i=0;i<row;i++)
         {  
             
             int k=0;
             for(int j=0;j<column;j++)
             {       
                temp[k]=arr[i][j]; //converting each row into a array
                k+=1;
             }
             int z=max(column,temp);
             System.out.println(z);
                        
         }
         
        // TODO code application logic here
    }
    
}
  

