import java.util.Scanner;

public class ipa1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int rem=0;
        int sum=0;
        while(n>0)
        {
            rem=n%10;
           sum=sum*10+rem;
           n=n/10;

        }
        if(sum==m)
    {
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    }
}


