import java.util.*;

public class ipa27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TravelAgencies[] tg= new TravelAgencies[4];
        for(int i=0;i<tg.length;i++)
        {
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            boolean e=sc.nextBoolean();sc.nextLine();
            tg[i]=new TravelAgencies(a,b,c,d,e);
        }
        int f=sc.nextInt();sc.nextLine();
        String g=sc.nextLine(); 
        
        TravelAgencies[] ans= findAgencyWithHighestPackagePrice(tg);
        System.out.println(ans[ans.length-1].getPrice());
        TravelAgencies [] ans1=agencyDetailsForGivenldAndType(tg,g,f);
        if(ans1!=null)
        {
            for(int i=0;i<ans1.length;i++)
            {
                System.out.println(ans1[i].getAgencyName()+":"+ans1[i].getPrice());
            }
        }
    }

    public static TravelAgencies[] findAgencyWithHighestPackagePrice(TravelAgencies[] tg1)
    {
        TravelAgencies[] tg2=new TravelAgencies[0];
        TravelAgencies del;
        for(int i=0;i<tg1.length;i++)
        {
            tg2=Arrays.copyOf(tg2, tg2.length+1);
            tg2[tg2.length-1]=tg1[i];
        }
        for(int i=0;i<tg2.length;i++)
        {
            for(int j=i;j<tg2.length;j++)
            {
                if(tg2[i].getPrice()>tg2[j].getPrice())
                {
                    
                    del=tg2[i];
                    tg2[i]=tg2[j];
                    tg2[j]=del;
                }
            }
        }
        return tg2;
    }

    public static TravelAgencies[] agencyDetailsForGivenldAndType(TravelAgencies[]tg3,String g1,int f1)
    {
        TravelAgencies[] tg4=new TravelAgencies[0];
        for(int i=0;i<tg3.length;i++)
        {
            if(tg3[i].getRegNo()==f1 && tg3[i].getPackageType().equalsIgnoreCase(g1) && tg3[i].isFlighFacility()==true)
            {
                tg4=Arrays.copyOf(tg4, tg4.length+1);
                tg4[tg4.length-1]=tg3[i];
            }
        }
        if(tg4.length>0)
        {
            return tg4;
        }
        else{
            return null;
        }

    }
}
class TravelAgencies{
private int regNo;
private String agencyName;
private String packageType;
private int price;
private boolean flighFacility;
public TravelAgencies(int regNo, String agencyName, String packageType,int price,boolean flighFacility )
{
    this.regNo=regNo;
    this.agencyName=agencyName;
    this.packageType=packageType;
    this.price=price;
    this.flighFacility=flighFacility;
}
public int getRegNo() {
    return regNo;
}
public void setRegNo(int regNo) {
    this.regNo = regNo;
}
public String getAgencyName() {
    return agencyName;
}
public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
}
public String getPackageType() {
    return packageType;
}
public void setPackageType(String packageType) {
    this.packageType = packageType;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
public boolean isFlighFacility() {
    return flighFacility;
}
public void setFlighFacility(boolean flighFacility) {
    this.flighFacility = flighFacility;
}

}