package Accenture;
import java.util.*;
public class uniquedigitrange {

       public static boolean isunique(int n)
       {
              HashSet<Integer> set=new HashSet<>();
              while(n>0)
              {
                 int k=n%10;
                  if(set.contains(k))
                  {
                     return false;
                  }
                  set.add(k);
                  n=n/10;  
              }
         return true;
       }
       public static void main(String[] args)
       {
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              int m=sc.nextInt();
              for(int i=n;i<=m;i++)
              {
                 if(isunique(i))
                 {
                     System.out.print(i+" ");
                 }
              }
       }
}
/*   When a particular range is given to Kyle, he writes down all the values within that range
which consists of unique digits.
For example, if the range 10-30 is given, he writes down all the values except 11 and 22 since
their digits are repeated. However, when large ranges are given, he finds it difficult to
identify the numbers. Help him by writing a code that prints all the values in the range that
satisfy the given condition.
Input Format
The input consists of the range values x and y.
Output Format
The output displays the values which have unique digits in the range as shown in the sample
test case.
Constraints
0 <= x, y <= 1000
Sample Input Sample Output
10 30
10 12 13 14 15 16 17 18 19 20 21 23 24 25 26 27 28 29 30 */
