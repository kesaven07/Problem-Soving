
package strings;

import java.util.Scanner;

/*Given a string of lowercase letters in the range ascii[a-z], determine a character
that can be removed to make the string a palindrome. There may be more than one solution, 
but any will do. For example,if your string is "bcbc", you can either remove 'b' at index  
or 'c' at index . If the word is already a palindrome or there is no solution,
return -1. Otherwise, return the index of a character to remove.
eg:Sample Input 1
3
aaab
baa
aaa
Sample Output
3
0
-1
Explanation

Query 1: "aaab"
Removing 'b' at index  results in a palindrome, so we print  on a new line.

Query 2: "baa"
Removing 'b' at index  results in a palindrome, so we print  on a new line.

Query 3: "aaa"
This string is already a palindrome, so we print . Removing any one of the characters
 would result in a palindrome, but this test comes first.
*/

public class IndexPalindrome {
     static int ispalindrome(String x)//normal palindrome function
    {
        int flag=0;
        String reverse="";
        for(int i=x.length()-1;i>=0;i--)
        {
            reverse+=x.charAt(i);
        }
        if(reverse.equals(x))
        {
            flag=1;
        }
         return flag;
    }


    static int palindromeIndex(String s) {
        int z=-1;
        int v=ispalindrome(s);
        if(v==1)
        {
            z=-1;
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                String x="";
                for(int j=0;j<s.length();j++)
                {
                if(i==j)
                {
                    continue;
                }   
                else
                {
                    x+=s.charAt(j);
                }
                }
            
          
                int k=ispalindrome(x);//removing one character from the string and
                                       //calling the palindrome function
                if(k==1)
                {
                    z=i;//finding the index to remove to form a palindrome string
            
                }
            }
        }
        return z;


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the string:");
          String s = in.next();
         int h=palindromeIndex( s);
         System.out.println(h);
        
    }
    
}


    

