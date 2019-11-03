
package matrix;

import java.util.Scanner;

/*Given a 2D array, print it in spiral form
eg: Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 */

public class MatrixSpiral {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row=in.nextInt();
         System.out.println("Enter no of columns:");
        int col=in.nextInt();
        int rs=0,cs=0;
        int mat[][]=new int[row][col];
          System.out.println("Enter the elements of Matrix:");
          for(int i=0;i<row;i++){
              for(int j=0;j<col;j++){
                  mat[i][j]=in.nextInt();
              }}
        
        while(rs<row && cs<col)
        {
        for(int i=cs;i<col;i++)
        {
                 
                System.err.print(mat[rs][i]);// Print the first row from the remaining rows 
            
        }
        rs++;
        for(int i=rs;i<row;i++  )
        {
            System.err.print(mat[i][col-1]); // Print the last column from the remaining columns 
        }
        col--;
        for(int i=col-1;i>=cs;i--)
        {
            System.err.print(mat[row-1][i]);// Print the last row from the remaining rows 
        }
        row--;
        for(int i=row-1;i>=rs;i--)
        {
            System.err.print(mat[i][cs]);// Print the first column from the remaining columns */ 
        }
        cs++;
        }
       System.out.println();
            
    }
    
    
}


