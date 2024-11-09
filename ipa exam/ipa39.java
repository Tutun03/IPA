
import java.util.Arrays;
public class ipa39 {
    public static void main(String[] args) {
        String a="rat";
        String b="cat";
        char ab[]=a.toCharArray();
        char al[]=b.toCharArray();
        Arrays.sort(ab);
        Arrays.sort(al);
        a=new String(ab);
        b=new String(al);
        if(a.equals(b))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
