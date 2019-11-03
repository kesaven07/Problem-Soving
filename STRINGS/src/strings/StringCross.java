
package strings;

import java.util.Scanner;

/*A program to print the following output for the given input. You can assume the string is of odd length
Eg 1: Input: 12345
Output:
1       5
  2   4
    3
  2  4
1      5
*/

public class StringCross {
     public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the string:");
     String s = scanner.nextLine();
        int k=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i==j)//top left to bottom right
                {
                    System.out.print(s.charAt(i));
                
                    if(i+j==s.length()-1){//the intersection point
                    k--;
                    }
                }
                else if( i+j==s.length()-1)//top right to bottom left
                {
                    System.out.print(s.charAt(k));
                    k--;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
         
    

