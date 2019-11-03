
package strings;

import java.util.Scanner;

/* Write a program to give the following output for the given input
The number varies from 1 to 99.
Eg 1: Input: a1b10
       Output: abbbbbbbbbb */

public class StringwithNumbers {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter Input String :");
         
        String s = sc.nextLine();
         
        String op;
        int count=0;
        int digit[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            Character x=s.charAt(i);
            String y=x.toString();
            if(Character.isAlphabetic(x))
            {
                continue;
            }
            else
            {
               digit[count]=Integer.parseInt(y);//if it is a integer,storing the integer
                                                 //value in a array.
               
                count++;
            }
             
        }
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            Character x=s.charAt(i);
            if(Character.isAlphabetic(x))
            {
                for(int j=0;j<digit[k];j++)//printing the alphabet the integer times
                                           //by using the value stored in a array. 
                {
                    System.out.print(x);
                }
                k++;
            }
        }
    }
}
    
    


    

