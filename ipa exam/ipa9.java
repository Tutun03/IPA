import java.util.Arrays;
import java.util.Scanner;

public class ipa9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("Number of space : "+count);
    }
}
