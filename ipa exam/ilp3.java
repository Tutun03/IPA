import java.util.Arrays;
import java.util.Scanner;

public class ilp3 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        // String p=sc.next();
        // System.out.println(s+","+p);
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(",");
        String p=sc.nextLine();
        String s2[]=p.split(",");
       for(int i=0;i<s2.length;i++)
       {
        s1=Arrays.copyOf(s1, s1.length+1);
        s1[s1.length-1]=s2[i];
       }
       String n=Arrays.toString(s1);
       String k=n.substring(1,n.length()-1);
       System.out.println(k);
    }
}
