import java.util.LinkedHashMap;
import java.util.*;
public class ipa34 {
// public static void main(String[] args) {
    
//     LinkedHashMap <Character,Integer>map=new LinkedHashMap<>();
//     Scanner sc=new Scanner(System.in);
//     String str=sc.nextLine();
//     for(int i=0;i<str.length();i++)
//     {
//         if(map.containsKey(str.charAt(i)))
//         {
//             map.put(str.charAt(i),map.get(str.charAt(i))+1);
//         }
//         else{
//             map.put(str.charAt(i),1);
//         }
//     }
//     char a=' ';
//     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//         if(entry.getValue()>1)
//         {
//              a=entry.getKey();
//         }
//     }
//     int b=0;
//     for(int i=str.length()-1;i>=0;i--)
//     {
//         if(str.charAt(i)==a)
//         {
//              b=i;
//             break;
//         }
//     }
//     for(int i=0;i<b;i++)
//     {
//         System.out.print(str.charAt(i));
//     }
    
// }    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder sb= new StringBuilder();
    sb.append(s.charAt(0));
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==' ' && i+1<s.length())
        {
            sb.append(s.charAt(i+1));
        }
    }
    System.out.println(sb);
}
}

