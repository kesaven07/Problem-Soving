
package matrix;

import java.util.Scanner;

/*A program that will take a string and make this conversion given a number of rows:
eg: Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Explanation :
P   A   H   N
A P L S I I G
Y   I   R */

public class ZigZag {
     public static int col(String s,int r){//function to find the column size of the matrix
        int y=r-2,x=0,k=0,count=0;
        while(x<s.length()){
            if(k%2==0){
                x+=r;
                count++;
            }
            else
            {
                int d=0;
                while(d<y){
                    x+=1;
                    count++;
                    if(x>=s.length()){
                        break;
                    } 
                    else
                    {
                        d++;
                        continue;}
                }
            }
            k++;
        }
        return count;}
                    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=in.next();
         System.out.println("Enter the rows:");
        int r=in.nextInt();
        char a[]=s.toCharArray();
       
        int res=col(s,r);
        
        char mat[][]=new char[r][res];
        int z=0,x=0,i=0;
        mat[x][x]=a[x];
        z++;
       
        while(z<s.length()){
            for(i=1;i<r;i++){
              
                
                mat[i][x]=a[z];
                z++;
                if(z==s.length()){
                    break;
                }
                else{
                    continue;
                }
            }
           
           
            if(z!=s.length()){
            for(int j=i-2;j>=0;j--){ 
                
                x++;
                mat[j][x]=a[z];
                z++;
                 if(z==s.length()){
                      break;
                }
                else{
                    continue;
                }
            }
            }
            
        }
        String temp="";
        
        
        for(i=0;i<r;i++){
            for(int j=0;j<res;j++){
               
                Character c=mat[i][j];
                if(Character.isAlphabetic(c)){
                    temp+=c;}
               
                
                    
            }
        }
           
            System.out.print(temp);
    }
}
        
                
         
    

