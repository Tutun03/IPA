import java.util.Scanner;

public class ipa16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int rem;
        int sum=0;
        if(no%2==0)
        {
            System.out.println("Can not reverse");
        }
        else
        {
            while(no!=0)
            {
                 rem=no%10;
                sum=sum*10+rem;
                no=no/10;
            }
            System.out.println(sum);
        }
        

    }
}
