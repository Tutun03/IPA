import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class ipa49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        char[] a = b.toCharArray();
        Arrays.sort(a);

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : a) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char aop = '\0'; // Initialize with a default value
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                aop = entry.getKey();
                break;
            }
        }

        StringBuilder lp = new StringBuilder();
        StringBuilder rp = new StringBuilder();

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != aop) {
                lp.append(a[i]);
            } else {
                rp.append(a[i]);
            }
        }

        int sum = lp.length() + (rp.length() * 2);
        System.out.println(sum);
    }
}
