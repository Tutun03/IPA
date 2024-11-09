import java.util.Scanner;

public class ipa61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int y=(int)Math.sqrt((double)a);
        if(y*y==a)
        {
            System.out.println("The number is a perfect square");
        }
        else{
            System.out.println("The number is not a perfect square");
        }
    }
    
}
