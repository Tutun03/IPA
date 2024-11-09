import java.util.Scanner;

public class ipa15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder sd = new StringBuilder();
        int count = 0;
        int m = -1; // Initialize m
        int n = -1; // Initialize n

       
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) { 
                if (s1.charAt(i) == s1.charAt(j)) {
                    m = i;
                    n = j;
                    break; 
                }
            }
            if (m != -1 && n != -1) { 
                break;
            }
        }

        if (m != -1 && n != -1) { 
            for (int i = 0; i < n; i++) {
                sd.append(s1.charAt(i)); 
            }
            System.out.println(sd);
        } else {
            System.out.println("No repeating characters found.");
        }
    }
}



