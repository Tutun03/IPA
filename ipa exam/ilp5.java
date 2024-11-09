import java.util.Scanner;

public class ilp5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char  c1=sc.next().charAt(0); 
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c1)
            {
                
                System.out.println(i);
                c++;
                break;
            }
        }   

        if(c==0)
        {
            System.out.println("NA");
        }

    }
}
