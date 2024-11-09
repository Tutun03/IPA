import java.util.Arrays;
import java.util.Scanner;

public class ipa31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double []arr=new double[a]; 
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextDouble();
        }
        double[] ans=findValidScores (arr);
        if(ans!=null)
        {
            System.out.print("Valid Scores = [");
            for(int i=0;i<ans.length-1;i++)
            {
                System.out.print(ans[i]+",");
            }
            System.out.println(ans[ans.length-1]+"]");
        }
        else{
            System.out.println("No valid score found");
        }
    }
    public static double[] findValidScores(double[] arr1)
    {
        double ans3[]=new double[0];
        for(int i=0;i<arr1.length;i++)
        {
            boolean ans2=validateScore(arr1[i]);
            if(ans2==true)
            {
                ans3=Arrays.copyOf(ans3, ans3.length+1);
                ans3[ans3.length-1]=arr1[i];

            }
           

        }
        if(ans3.length>0)
        {
            return ans3;
        }
        else{
            return null;
        }
    }

    public  static boolean  validateScore(double a)
    {
        if(a>0 && a<=100 && (int)a==a)
        {
            return true;
        }
        return false;
   
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();sc.nextLine();
    //     double[] arr = new double[n];
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = sc.nextDouble();
    //     }
    //     String ans = findValidScores(arr);
    //     if(ans!=null)
    //     {
    //         System.out.println("Valid scores are = "+ans);
    //     }
    //     else
    //     {
    //         System.out.println("No valid score found.");
    //     }
    // }
    // public static boolean ValidateScore(double n)
    // {
    //     if(n>0 && n<=100 && (int)n==n)
    //     {
    //         return true;
    //     }
    //     return false;
    // }
    // public static String findValidScores(double[] a)
    // {
    //     int[] ar = new int[0];
    //     for (int i = 0; i < a.length; i++) {
    //         if(ValidateScore(a[i])==true)
    //         {
    //             ar = Arrays.copyOf(ar,ar.length+1);
    //             ar[ar.length-1] = (int)a[i];
    //         }
    //     }
    //     if(ar.length>0)
    //     {
    //         String arr = Arrays.toString(ar);
    //         return arr;
    //     }
    //     return null;
    // }
    }
}

