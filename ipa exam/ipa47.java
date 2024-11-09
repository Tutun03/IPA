import java.util.Scanner;
import java.util.*;
public class ipa47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Inventory[] in=new Inventory[4];
        for(int i=0;i<in.length;i++)
        {
            String a=sc.nextLine();
            int b=sc.nextInt();sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            in[i]=new Inventory(a,b,c,d);
        }
        int r1=sc.nextInt();
        Inventory[] ans1=Replenish(in,r1);
        if(ans1!=null)
        {
            for(int i=0;i<ans1.length;i++)
            {
              if(ans1[i].getThreshold()>75)
              {
                System.out.println(ans1[i].getinventoryId()+"Critical Filling");
              }
              else if(ans1[i].getThreshold()>50 && ans1[i].getThreshold()<=75)
              {
                System.out.println(ans1[i].getinventoryId()+"Moderate Filling");
              }    
              else
              {
                System.out.println(ans1[i].getinventoryId()+"Non-Critical Filling");
              }
            }

        }
       
    }
    public static Inventory[] Replenish(Inventory[] in,int y) {
    Inventory[] ans=new Inventory[0];
    for(int i=0;i<in.length;i++)
    {
        if(in[i].getThreshold()<=y)
        {
            ans=Arrays.copyOf(ans,ans.length+1);
            ans[ans.length-1]=in[i];
        }
    }
    if(ans.length>0)
    {
        return ans;
    }
    else{
        return null;
    }
    }
}
class Inventory{
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
    this.inventoryId = inventoryId;
    this.maximumQuantity = maximumQuantity;
    this.currentQuantity = currentQuantity;
    this.threshold = threshold;
    }

    public String getinventoryId() {
        return inventoryId;
    }

    public void setinventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getmaximumQuantity() {
        return maximumQuantity;
    }

    public void setmaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getcurrentQuantity() {
        return currentQuantity;
    }

    public void setcurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }



    
}
