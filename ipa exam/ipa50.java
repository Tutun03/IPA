import java.util.*;
public class ipa50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String l=Integer.toString(a);
        int b=a;
        int sum=0;
        while(b!=0)
        {
            int rem=b%10;
            sum=sum+(int)Math.pow(rem,l.length());
            b=b/10;

        }
        if(sum==a)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
