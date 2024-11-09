import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class ipa17 {
    public static void main(String[] args) {
        
        
        LinkedHashSet<Character> seto = new LinkedHashSet<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
    
        
        
        for (int i = 0; i < s.length(); i++) {
            seto.add(s.charAt(i));
        }
        
      
        sc.close();

        
        
        for (char c: seto) {
            System.out.print(c);
        }
    }
}

