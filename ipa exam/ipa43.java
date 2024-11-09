import java.util.*;
public class ipa43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n!=0)
    {
        int y=n%10;
        if(y%2!=0)
        {
            sum=sum+y;
        }
        n=n/10;
    }
    System.out.println(sum);
    }
}
