import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale.Category;

public class ipa30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Resort[] rs=new Resort[4];
        for(int i=0;i<rs.length;i++)
        {
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();sc.nextLine();
            double e=sc.nextDouble();sc.nextLine();
            rs[i]=new Resort(a,b,c,d,e);
        }
        String ck=sc.nextLine();
        double ans=findAvgPrice(rs,ck);
        System.out.println((int)ans);
    }
    public static double findAvgPrice(Resort[] rs1,String ck1)
    {
        double[] ck2=new double[0];
        double sum=0;
        for(int i=0;i<rs1.length;i++)
        {
            if(rs1[i].getCatagory().equalsIgnoreCase(ck1)&&rs1[i].getResortRating()>4)
            {
                ck2=Arrays.copyOf(ck2, ck2.length+1);
                ck2[ck2.length-1]=rs1[i].getResortPrice();
            }
        }
        for(int i=0;i<ck2.length;i++)
        {
          sum=sum+ck2[i];
        }

        if(sum>0)
        {
            double d= sum/(double)ck2.length;
            return d;
        }
        else
        {
            return 0;
        }
    }
}
class Resort{
    private int resortId;
    private String resortName;
    private String Catagory;
    private double resortPrice;
    private double resortRating;

    public Resort(int resortId,String resortName,String Catagory,double resortPrice,double resortRating)
    {
        this.resortId=resortId;
        this.resortName=resortName;
        this.Catagory=Catagory;
        this.resortPrice=resortPrice;
        this.resortRating=resortRating;
    }

    public int getResortId() {
        return resortId;
    }

    public void setResortId(int resortId) {
        this.resortId = resortId;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String catagory) {
        Catagory = catagory;
    }

    public double getResortPrice() {
        return resortPrice;
    }

    public void setResortPrice(double resortPrice) {
        this.resortPrice = resortPrice;
    }

    public double getResortRating() {
        return resortRating;
    }

    public void setResortRating(double resortRating) {
        this.resortRating = resortRating;
    }

    
}
