
package arrays;

import java.util.Scanner;


/*Given a lower limit and upper limit ,find how many elements are distinct in 
 between the limits.eg- lower limit-100,upper limit-105 ,the output is 4.
Explanation- the elements are 100,101,102,103,104,105 .Out of these elements 100 
,101 are distinct because it has repetition of characters.(0 in 100 and 1 in 101)*/

 
public class DistinctBetweentheLimits {
     public static int isRepeat(String s)/*function to check if there is any 
                                            repetition of characters in the string)*/
         
     {  
        int count=0;
    
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count=1;
                    break;
                }}}
        return count;}
                
                    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        System.out.println("Enter lower limit:");
        int m=in.nextInt();
         System.out.println("Enter upper limit:");
        int n=in.nextInt();
        int ans=0;
        
        for(int i=m ;i<=n;i++){
            String s=Integer.toString(i);/*typecasting integer to string because,
                                          each character can be easily accesed*/
            
            int x=isRepeat(s);
            //int ans=0;
            if(x==0){
                ans++;}}
            System.out.println(ans);
            
            
            
        
    }
    
}
 
    
