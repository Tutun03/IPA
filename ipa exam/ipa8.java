import java.util.Scanner;

public class ipa8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
       int  COUNT=0;
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s1[i].length()-1;j++)
            {
                if((s1[i].charAt(j)=='a'||s1[i].charAt(j)=='e'||s1[i].charAt(j)=='i'||s1[i].charAt(j)=='o'||s1[i].charAt(j)=='u'||s1[i].charAt(j)=='A'||s1[i].charAt(j)=='E'||s1[i].charAt(j)=='I'||s1[i].charAt(j)=='O'||s1[i].charAt(j)=='U')&&(s1[i].charAt(j+1)=='a'||s1[i].charAt(j+1)=='e'||s1[i].charAt(j+1)=='i'||s1[i].charAt(j+1)=='o'||s1[i].charAt(j+1)=='u'||s1[i].charAt(j+1)=='A'||s1[i].charAt(j+1)=='E'||s1[i].charAt(j+1)=='I'||s1[i].charAt(j+1)=='O'||s1[i].charAt(j+1)=='U'))
                {
                    COUNT++;
                    break;
                }
            }
        }
        System.out.println(COUNT);
    }
}
