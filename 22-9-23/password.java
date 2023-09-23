/*You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number*/
package Accenture;
import  java.util.*;
public class password {
        public static int CheckPassword(String st, int n)
        {
           int c=0,num=0;
         if(n<4)
         {
              return 0;
         }
         if(Character.isDigit(st.charAt(0)))
         {
                     return 0;
              }
         for(int i=0;i<n;i++)
         {
              if(st.charAt(i)==' '||st.charAt(i)=='/'){
                     return 0;
              }
              if(Character.isUpperCase(st.charAt(i)))
              {
                     c++;
              }
              else if(Character.isDigit(st.charAt(i)))
             {
                    num++; 
              }
         }
          if(c>0 && num>0)
          {
              return 1;
          }
       return 0;
}
       public static void main(String[] args)
       {
              Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            int n=str.length();
             int m=CheckPassword(str,n);
       System.out.println(m);

       }
}
