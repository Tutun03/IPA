import java.util.Scanner;
import java.util.Arrays;
public class ipa42 {
    public static void main(String[] args) {
        Laptop l1[]=new Laptop[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<l1.length;i++)
        {
           int a=sc.nextInt();sc.nextLine();
           String b=sc.nextLine();
           String c=sc.nextLine();
           double d=sc.nextDouble();sc.nextLine();
           int e=sc.nextInt();sc.nextLine();
           l1[i]=new Laptop(a,b,c,d,e);
        }
        String b1=sc.nextLine();
        String c1=sc.nextLine();
        int ans=countOfLaptopByBrand(l1,b1);
        if(ans!=0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("The given brand is not available");
        }
        Laptop ans2[]=searchLaptopByOsType(l1,c1);
        if(ans2.length!=0)
        {
            for(int i=0;i<ans2.length;i++)
            {
                System.out.println(ans2[i].getLaptopId());
                System.out.println(ans2[i].getRating());
            }
        }
        else{
            System.out.println("The given os type is not available");
        }
    }
    public static int countOfLaptopByBrand(Laptop l1[],String b1)
    {
        int count=0;
        for(int i=0;i<l1.length;i++)
        {
            if(l1[i].getBrand().equalsIgnoreCase(b1))
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;

        }
        else{
            return 0;
        }
    }

    public static Laptop[] searchLaptopByOsType(Laptop l1[],String c1)
    {
        Laptop l2[]=new Laptop[0];
        Laptop temp;
        for(int i=0;i<l1.length;i++)
        {
           if (l1[i].getOsType().equalsIgnoreCase(c1))
           {
            l2=Arrays.copyOf(l2,l2.length+1);
            l2[l2.length-1]=l1[i];
           }
        }
        for(int i=0;i<l2.length;i++)
        {
            for(int j=i;j<l2.length;j++)
            {
                if(l2[i].getLaptopId()<l2[j].getLaptopId())
                {
                    temp=l2[i];
                    l2[i]=l2[j];
                    l2[j]=temp;
                }
            }
        }
        if(l2.length>0)
        {
            return l2;
        }
        else{
            return null;
        }
    }
}
class Laptop{
    private int  laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;
    public Laptop(int laptopId, String brand, String osType, double price,int rating) {
    this.laptopId = laptopId;
    this.brand = brand;
    this.osType = osType;
    this.price = price;
    this.rating = rating;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getLaptopId() {
        return laptopId;
    }
    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getOsType() {
        return osType;
    }
    public void setOsType(String osType) {
        this.osType = osType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
