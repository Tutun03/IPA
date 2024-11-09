import java.util.Scanner;

public class ipa2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word[]=null;
        String s=sc.next();
        word=s.split(" ");
        for(int i=0;i<word.length;i++)
        {
         System.out.println(word[i]);
        }        
    }
    
}
