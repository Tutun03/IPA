import java.util.Scanner;

public class ipa6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        int p=0;

        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                 c++;

            }
            if(Character.isUpperCase(s.charAt(i)))
            {
                p++;
            }
        }
        System.out.println(c);
        System.out.println(p);

    }
}
