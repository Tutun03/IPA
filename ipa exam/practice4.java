// public class practice4 {
//     public static void main(String[] args) {
//         String s1="madhu";
//         char c1[]=s1.toCharArray();
//         for(int i=0;i<c1.length;i++)
//         {
//             System.out.println(c1[i]);
//         }
//     }
// }
// import java.util.*;
// public class practice4{
//     public static void main(String[] args) {
//         String [] Name= {"madhu","koyel","sanchita","prity"}; 
// Arrays.sort(Name);
// for (int i=0;i<Name.length;i++)
// {
//     System.out.println(Name[i]);
// }  
//     }
// }

import java.util.*;
public class practice4{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int x=sc.nextInt();
       for(int i=1;i<=x;i++)
       {
        if(i%2==0)
        {
            System.out.println(i+"even");
        }
        else{
            System.out.println(i+"odd");
        }
       } 
    }
}