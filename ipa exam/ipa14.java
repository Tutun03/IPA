import java.util.Scanner;

public class ipa14 {
    public static void main(String[] args) {
        int arr[]=new int[8];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            int num=arr[i];
            while((num+1)!=(arr[i+1]))
            {
              System.out.print(num+1);
              num=num+1;
            }
        }
    }
}
