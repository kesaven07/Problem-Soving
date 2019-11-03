
package strings;

import java.util.Scanner;

/*A program determine whether a given string can be rearranged into a palindrome. 
If it is possible, return YES, otherwise return NO.
eg: Sample Input 1
aaabbbb
Sample Output - YES
Explanation :
A palindromic permutation of the given string is bbaaabb.
Sample Input 2
cdefghmnopqrstuvw
Sample Output 2- NO
Explanation :
Palindromes longer than 1 character are made up of pairs of characters. There are none here.
*/

public class GOT {
     public static void main(String[] args) {
           
         
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the string:");
     String s1 = scanner.nextLine();
    int c[]=new int[26];
    int k=s1.length()%2;
    int count=0;
    int flag=0;
    
    for(int i=0;i<s1.length();i++)c[s1.charAt(i)-97]++;//counting the frequency of each alphabet
    for(int i=0;i<c.length;i++)
        
      /* logic:
If len(string) is even, count of each elemnt should be even.
If len(string) is odd, count of ONLY one element should be odd, counts of all other elements should be even.*/
        
    {
   if(k==0)
   {
       if(c[i]%2!=0){
           flag=1;}
   }
   else
   {
        if(c[i]%2==0)
        {
            continue;
        }
        else
        {
            count+=1;
        }
   }
  }
        System.out.println(count);
    if(k==0)
    {
        if(flag==0)
        System.out.println("YES");
        else
            System.out.println("NO");    
    }
    else
    {
        if(count==1)
        System.out.println("YES");
        else
        {
            System.out.println("NO");
        }
    }
    
   
    }
    
}


    

