import java.util.*;
import java.util.Scanner;

public class ipa60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer>hm=new HashMap<>();
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++)
        {
           if(hm.containsKey(s.charAt(i)))
           {
               hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
           }
           else
           {
            hm.put(s.charAt(i),1);
           }
        }
        
        for(Map.Entry<Character,Integer> e:hm.entrySet())  //to iterate through the HashMap and print the key-value pairs.
        {
            System.out.print(e.getKey()+""+e.getValue());
        }
    }
}
