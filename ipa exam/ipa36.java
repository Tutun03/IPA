import java.util.*;

public class ipa36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
           for(int i=0;i<3;i++)
           {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
           }  
            int a1[]=new int[0];
           for(int i=0;i<3;i++)
           {
           
               a1=Arrays.copyOf(a1,a1.length+1);
               a1[a1.length-1]=a[i][i];
            
           }

           for (int i = 2, j = 0; i >= 0 && j < 3; i--, j++) {
           a1=Arrays.copyOf(a1,a1.length+1);
           a1[a1.length-1]=a[i][j];
        }
        int a2[]=new int[0];
        
        for(int i=0;i<a1.length;i++)
        {
            int count=1;
            for(int j=2;j<a1[i]-1;j++)
            {
                if(a1[i]%j==0)
                {
                    count=0;
                }
            }
            if(count==1)
            {
                a2=Arrays.copyOf(a2,a2.length+1);
                a2[a2.length-1]=a1[i];
            }

        }
       for(int i=0;i<a2.length;i++)
       {
        System.out.println(a2[i]);
       }
    }
}

