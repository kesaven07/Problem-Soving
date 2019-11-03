
package strings;

import java.util.Scanner;

/*Given two strings, s1 and ,s2 that may not be of the same length, determine the minimum 
number of character deletions required to make s1 and s2 anagrams. Any characters can be 
deleted from either of the strings.
eg: Sample Input
cde
abc
Sample Output
4
Explanation:
We delete the following characters from our two strings to turn them into anagrams of each other:

Remove d and e from cde to get c.
Remove a and b from abc to get c.
We had to delete  characters to make both strings anagrams.
*/


public class MakingAnagrams {
    static int makingAnagrams(String s1, String s2){
    int l1,l2,i,j,c=0,e=0,l=0;
    l1=s1.length();
    l2=s2.length();
    int k=l1+l2;
    char[] c1= s1.toCharArray();
    char[] c2 = s2.toCharArray();
    for(i=0;i<l1;i++) {
        for(j=0;j<l2;j++) {
            if(c1[i]==c2[j]){
                
                 e+=2;
                c2[j]='@';//if characters in s1 and s2 are matched ,they are changed to
                          //special characters so that they are not matched in the 
                          //upcoming iterations
                break;
            }

        }
       
    }
                 
   l=k-e;
   return l;
}

public static void main(String[] args) {
   Scanner  in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    int result = makingAnagrams(s1, s2);
    System.out.println(result);

}
   

}

    

