//input: quick fox jumps lake
//ouput: quick foxjmpslae

package Accenture;
import java.util.*;
public class reprintString {
       public static void main(String[] args)
       {
              Scanner sc=new Scanner(System.in);
              String str=sc.nextLine();
              HashMap<Character,Integer> map=new HashMap<>();
              for(char ch:str.toCharArray())
              {
                  if(map.containsKey(ch))
                  {
                     map.put(ch,map.get(ch)+1);
                  }
                  else{
                     map.put(ch,1);
                  }   
              }
               String st="";
              for(char ch:str.toCharArray())
              {
                    if(map.get(ch)>0)
                    {
                       st+=ch;
                       map.put(ch,0);
                    } 
              }
              System.out.println(st);
       }
}
