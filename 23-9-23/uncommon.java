/*  
5
4
1 3 5 2 9
3 9 2 10
16 
explaination : uncommon element element in both the arrays 1+5+10=16
*/
package Accenture;
import java.util.*;
public class uncommmon {
       public static void main(String[] args)
       {
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              int m=sc.nextInt();
              int arr[]=new int[n];
              int a[]=new int[m];
              int su[]=new int[n+m];
              int j=0;
              for(int i=0;i<n;i++)
              {
                     arr[i]=sc.nextInt();
                     su[j]=arr[i];
                     j++;
              }
              for(int i=0;i<m;i++)
              {
                     a[i]=sc.nextInt();
                     su[j]=a[i];
                     j++;
              }
             HashMap<Integer, Integer> map=new HashMap<>();
             for(int i=0;i<su.length;i++)
             {
              if(map.containsKey(su[i]))
              {
                     map.put(su[i],map.get(su[i])+1);
              }
              else{
                     map.put(su[i],1);
              }
             }
             int sum=0;
             for(int i: map.keySet())
             {
                    if(map.get(i)==1)
                    {
                           sum+=i;
                    }
             }
             System.out.println(sum);
       }
}
