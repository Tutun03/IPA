import java.util.Scanner;
import java.util.Arrays;
public class ipa46 {
    public static void main(String[] args) {
        Fruits[] f1=new Fruits[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<f1.length;i++)
        {
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            f1[i]=new Fruits(a,b,c,d);
        }
        int r1=sc.nextInt();
        Fruits ans=findMaximumPriceByRating(f1,r1);
        if(ans!=null)
        {
           
            System.out.println(ans.getfruitId());
        }
        else{
            System.out.println("No such Fruit");
        }

    }
    public static Fruits findMaximumPriceByRating(Fruits[] f1,int y) {
    Fruits[] f2=new Fruits[0];
    Fruits temp;
    for(int i=0;i<f1.length;i++)
    {
        if(f1[i].getrating()>y)
        {
            f2=Arrays.copyOf(f2,f2.length+1);
            f2[f2.length-1]=f1[i];
        }
    }
    for(int i=0;i<f2.length;i++)
    {
        for(int j=i;j<f2.length;j++)
        {
            if(f2[i].getprice()<f2[j].getprice())
            {
               temp=f2[i];
                f2[i]=f2[j];
                f2[j]=temp;
            }
        }
    }
    if(f2.length>0)
    {
        return f2[0];
    }
    else
    {
        return null;
    }

    }
        
}
class Fruits{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    public Fruits(int fruitId, String fruitName, int price, int rating) 
        {
            this.fruitId = fruitId;
            this.fruitName = fruitName;
            this.price = price;
            this.rating = rating;
        }

        public void setfruitId(int fruitId) {
        this.fruitId = fruitId;
        }
        public int getfruitId() {
       return fruitId;
        }
        public void setfruitName(String fruitName) {
        this.fruitName = fruitName;
        }
        public String getfruitName() {
        return fruitName;
        }
        public void setprice(int price) {
        this.price = price;
        }
        public int getprice() {
        return price;
        }
        public void setrating(int rating) {
        this.rating = rating;
        }
        public int getrating() {
        return rating;
        }

}