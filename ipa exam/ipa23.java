import java.util.Scanner;
import java.util.*;
public class ipa23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Phone []ph= new Phone[4];
        for(int i=0;i<ph.length;i++)
        {
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            ph[i]=new Phone(a,b,c,d);

        }
        String bd=sc.nextLine();
        String osp=sc.nextLine();
        int ans=findPriceForGivenBrand(ph,bd);
        if(ans!=0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("The given Brand is not available");
        }

        int ans2=getPhoneBasedOnOs(ph,osp);
        if(ans2!=0)
        {
          System.out.println(ans2);
        }
        else{
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findPriceForGivenBrand(Phone[]ph1,String bk)
    {

        int sum=0;
        for(int i=0;i<ph1.length;i++)
        {
          
            {
                sum=sum+ph1[i].getPrice();
            }
        }
        if(sum>=0)
        {
            return sum;
        }
        else{
            return 0;
        }
    }

    public static int getPhoneBasedOnOs(Phone[] ph2,String osl)
    {
        for(int i=0;i<ph2.length;i++)
        {
            if(ph2[i].getOs().equalsIgnoreCase(osl) && ph2[i].getPrice()>=5000)
            {
                return ph2[i].getPhoneId();
            }
        }
        return 0;
    }
}

class Phone{
    private int phoneId;
    private String os;
    private String brand;
    private int price;
     
    public Phone(int phoneId,String os,String brand,int price){
    this.brand=brand;
    this.os=os;
    this.phoneId=phoneId;
    this.price=price;

    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}