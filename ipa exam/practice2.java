import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        String x= sc.nextLine();
        String rev="";
        for(int i=x.length()-1;i>=0;i--)
        {
        //  rev=x.charAt(i)+rev;
        System.out.print(x.charAt(i));
        }
        // System.out.println(rev);
    }
}
