
package strings;

import java.util.Scanner; 

/*Given a String, reverse each word in it. Words are separated by dots.
eg: Input:
i.like.this.program.very.much
pqr.mno
Output:
i.ekil.siht.margorp.yrev.hcum
rqp.onm
*/


public class ReverseEachChar {
     public static void main(String[] args) {
        // TODO code application logic here
        
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int n;
while(t-- > 0)
{
    String str=sc.next();
    String st[]=str.split("\\.");//spliting each word by dot(.)
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<st.length;i++)
    {
    StringBuffer sb1=new StringBuffer(st[i]);
    sb1.reverse();
    if(i != st.length - 1)
    sb.append(sb1).append('.');
    else
    sb.append(sb1);
	}
	System.out.println(sb);
}
}}
    

