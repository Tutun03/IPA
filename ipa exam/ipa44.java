import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
public class ipa44 {
    public static void main(String[] args) {
    //     String a="Gum";
       
    //     String b="muG";
    //     char a1[]=a.toCharArray();
    //     char a2[]=b.toCharArray();
    //     Arrays.sort(a1);
    //     Arrays.sort(a2);
    //    a=new String(a1);
    //    System.out.println(a);
    //    b=new String(a2);
    //    System.out.println(b);
    //     if(a.equals(b))
    //     {
    //         System.out.println(true);
    //     }
    //     else{
    //         System.out.println(false);
    //     }
    // int[]a1={20,40,10,7,36};
    // Arrays.sort(a1);
    //   System.out.println(a1[1]);
    //   System.out.println(a1[a1.length-2]);
    // for(int i=1;i<=15;i++)
    // {
    //     if(i==1)
    //     {
    //         continue;
    //     }
    //      int count=0;
    //      for(int j=2;j<i;j++)
    //      {
    //         if(i%j==0)
    //         {
    //             count=1;
    //             break;
    //         }
    //      }
    //      if(count==0)
    //      {
    //          System.out.println(i);
    //      }
    // }
    // String a="Kolkata is a capital of West Bengal";
    // for(int i=0;i<a.length();i++)
    // {
    //     if(a.charAt(i)!=' ')
    //     {
    //         System.out.print(a.charAt(i));
    //     }
    // }
    // int a=1101;
    // int c=0;
    // int sum=0;
    // while(a!=0)
    // {
    //     int rem=a%10;
    //     sum=sum+(rem*(int)Math.pow(2, c));
    //     a=a/10;
    //     c++;
    // }
    // System.out.println(sum);

    // }
   
//    LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
//     Scanner sc=new Scanner(System.in);
//     String a=sc.nextLine();
//     StringBuilder sb=new StringBuilder();
//     for(int i=0;i<a.length();i++)
//     {
//         if(a.charAt(i)==' ')
//         {
//             sb.append(a.charAt(i));
//         }
        
//         if(!map.containsKey(a.charAt(i)))
//         // {
//         //     map.put(a.charAt(i),map.get(a.charAt(i))+1);
//         // }
//         // else{
//         //     map.put(a.charAt(i),1);
//         // }
//         {
//             map.put(a.charAt(i),1);
//             sb.append(a.charAt(i));
//         }
    
//     }
//    System.out.println(sb.toString());
// Scanner sc=new Scanner(System.in);
// String a=sc.nextLine();
// int count=0;
// for(int i=0;i<a.length();i++)
// {
//     if(isVowel(a.charAt(i)))
//     {
//         count++;
//     }
// }
// System.out.println(count);
// LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
// Scanner sc=new Scanner(System.in);
// String a=sc.nextLine();
// StringBuilder sb=new StringBuilder();
// for(int i=0;i<a.length();i++)
// {
//  if(!map.containsKey(a.charAt(i)))
//  {
//     map.put(a.charAt(i),1);
//     sb.append(a.charAt(i));
//  }
// }
// System.out.println(sb.toString());
// String s="CHNKSC";
// String S1="CHN";
// if(s.contains(S1))
// {
//     for(int i=s.length()-1;i>=3;i--)
//     {
//       System.out.print(s.charAt(i));
//     }
// }

// String s="Hey hello you are having any trouble";
// String[]s1=s.split(" ");
// int max=-99999999;
// String lp="";
// for(int i=0;i<s1.length;i++)
// {
//     if(s1[i].length()>max)
//     {
//         max=s1[i].length();
//          lp=s1[i];
//     }
    

// }
// System.out.println(lp);

// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int count=0;
// int sum=0;
// for(int i=a;i<=b;i++)
// {
//     if(i%3==0 && i%2==0)
//     {
        
//          sum=sum+i;
//          count++;
//     }
// }
// System.out.println(count);
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
char s2[]=s1.toCharArray();
Arrays.sort(s2);    
System.out.println(s2[0]);
    }
// public static boolean isVowel(char ch)
// {
//     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//     {
//         return true;
//     }
//     else{
//         return false;
// }
// }


}
