
package strings;

import java.util.Scanner;

/* A program to reverse every word of a string and display the reversed string as an output. 
For example, if we input a string as “Reverse the word of this string” then the output of the
 program would be: “esrever eht drow fo siht gnirts”.
*/


public class WordReverse {
     public static String reverseTheSentence(String inputString)
    {
        String[] words = inputString.split("\\s");//spliting by space
         
        String outputString = "";
         
        for (int i = words.length-1; i >= 0; i--)//normal reverse logic
        {
            outputString = outputString + words[i]+" ";
        }
         
        return outputString;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         

     
   
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter Input String :");
         
        String inputString = sc.nextLine();
         
        String outputString = reverseTheSentence(inputString);
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Output String : "+outputString);
         
        //sc.close();
    }
}
    

