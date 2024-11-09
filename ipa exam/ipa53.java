import java.util.Scanner;
import java.util.Arrays;
public class ipa53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
            int count=0;
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                  count=1;
                  break;
                }
            }
            if(count==0)
            {
               arr1=Arrays.copyOf(arr1,arr1.length+1);
               arr1[arr1.length-1]=arr[i];
            }
        }
        }
        Arrays.sort(arr1);
        System.out.println(arr[arr1.length-1]);
    }
}
