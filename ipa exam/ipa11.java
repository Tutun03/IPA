import java.util.Scanner;

public class ipa11 {
    public static void main(String[] args) {
        System.out.print("Enter ISBN: ");
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s[]=s1.split("-");
      if(s.length!=0)
      {
        int i=0;
         System.out.println("GSI Prefix: "+s[i++]);
         System.out.println("Group Identifier: "+s[i++]);
         System.out.println("Publisher Code: "+s[i++]);
         System.out.println("Item Number: "+s[i++]);
         System.out.println("Check Digit: "+s[i++]);       
      }
    }
}
