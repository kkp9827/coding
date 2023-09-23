/*Input
Num 1: 451
Num 2: 349
Output
2
Explanation:

Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned.*/
package TCS_nqt;
import java.util.*;
public class carrypractice {
       public static void main(String[] args)
       {
              Scanner sc=new Scanner(System.in);
              int num1=sc.nextInt();
              int num2=sc.nextInt();
              int c=0;int carry=0;
              while((num1!=0)&&(num2!=0))
              {
                     int sum=0;
                     int k=num1%10;
                     int m=num2%10;
                     sum=k+m+carry;
                     if(sum>9)
                     {
                        carry=1;
                        c++;
                     }
                     else{
                            carry=0;
                     }
                     num1=num1/10;
                     num2=num2/10;
              }
              System.out.println(c);
       }
}
