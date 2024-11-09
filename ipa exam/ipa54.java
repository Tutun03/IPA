// import java.util.Scanner;
// public class ipa54 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int y=sc.nextInt();
//         int sum=0;
//         int a=0;
//         int b=1;
//         System.out.print(a);
//         System.out.print(b);
       
//         while(sum<y)
//         {
//            sum=a+b;
//            System.out.print(sum);
//            a=b;
           
//            b=sum;
           
//         }
//     }
// }
import java.util.Scanner;

public class ipa54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();
        
        int a = 0, b = 1;
        int sum = a + b;
        
        System.out.print(a + " " + b);

        while (sum <= y) {
            System.out.print(" " + sum);
            a = b;
            b = sum;
            sum = a + b;
        }
    }
}
