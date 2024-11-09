// import java.util.Scanner;

// public class practice6 {
//     public static void main(String[] args) {
//         int arr[]=new int[5];
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<arr.length;i++)
//         {
//            arr[i]=sc.nextInt();
//         }
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=0;
//         int count=0;
//         for(int i=a;i<b-1;i++)
//         {
//             sum=sum+arr[i];
//             count++;
//         }
//         System.out.println(sum/count);
//     }
// }

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
       
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=a;i<b-1;i++)
        {
            sum=sum+arr[i];
            count++;
        }
        System.out.println(sum/count);
    }
}

