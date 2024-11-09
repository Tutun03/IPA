import java.util.Scanner;

public class ipa4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
              if(Character.isAlphabetic(s.charAt(i-1)))
              {
                System.out.print(s.charAt(i-1));
              }
            }
        }
        System.out.println(s.charAt(s.length()-1));



    }
}
