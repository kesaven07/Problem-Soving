
package strings;

import java.util.Scanner;

/* Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1  */


public class SubstringIndex {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner  in = new Scanner(System.in);
    System.out.println("Enter the string:");
    String s = in.next();
    System.out.println("Enter the substring:");
    String a = in.next();
        int k=a.length();
        String temp ="";
        int i=0,j=0,n=0,m=0;
       
        
            for(j=0;j<s.length();j++)
            {
                if(a.charAt(i)==s.charAt(j)) //if the starting letter of the substring is matched,
                                              //storing the index of the string
                {
                    m+=j;
                    break;
                }
            }
        int z=m+k;
        if(z<=s.length())
        {
            String x=s.substring(m, z);
             if(a.equals(x))
            {
                System.out.println(m);
            }
            else
            {
                System.out.println(-1);
            }
        
        }
        else
        {
            System.out.println(-1);
            
        }
    }
}
