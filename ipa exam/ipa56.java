import java.util.Arrays;
import java.util.Scanner;
public class ipa56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Engine[] ep=new Engine[4];
        for(int i=0;i<ep.length;i++)
        {
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();sc.nextLine();
            ep[i]=new Engine(a,b,c,d);
        }
        String type=sc.nextLine();
        String name=sc.nextLine();
        int ans=findAvgEnginePriceByType(ep,type);
        if(ans!=0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("There are no Engine found with  given type");
        }
        Engine[]ans1=searchEngineByName(ep,name);
        if(ans1!=null)
        {
          for(int i=0;i<ans1.length;i++)
          {
            System.out.println(ans1[i].getEngineId());
          }
        }
        else{
          System.out.println("There are no Engine with the given name");  
        }
    }

    public static int findAvgEnginePriceByType(Engine[] ep,String type)
    {
        int sum=0;
        int count=0;
        for(int i=0;i<ep.length;i++)
        {
            if(ep[i].getEngineType().equalsIgnoreCase(type))
            {
                count++;
                    sum=sum+(int)ep[i].getEnginePrice();
            }
        }
        int avg=sum/count;
        if(count>0)
        {
            return avg;
        }
        else{
            return 0;
        }
    }

    public static Engine[] searchEngineByName(Engine[] ep,String name)
    {
        Engine[] ep2=new Engine[0];
        Engine temp;
        for(int i=0;i<ep.length;i++)
        {
            if(ep[i].getEngineName().equalsIgnoreCase(name))
            {
                ep2=Arrays.copyOf(ep2, ep2.length+1);
                ep2[ep2.length-1]=ep[i];
            }
        }
        for(int i=0;i<ep2.length;i++)
        {
            for(int j=i;j<ep2.length;j++)
            {
                if(ep2[i].getEngineId()>ep2[j].getEngineId())
                {
                    temp=ep2[i];
                    ep2[i]=ep2[j];
                    ep2[j]=temp;
                }
            }
        }
        if(ep2.length>0)
        {
            return ep2;
        }
        else{
            return null;
        }
    }
}
class Engine{
    private int EngineId;
    private String EngineName;
    private String EngineType;
    private double EnginePrice;
    public Engine(int EngineId, String EngineName, String EngineType, double EnginePrice) 
        {
            this.EngineId = EngineId;
            this.EngineName = EngineName;
            this.EngineType = EngineType;
            this.EnginePrice = EnginePrice;
        }
    public int getEngineId() {
        return EngineId;
    }
    public void setEngineId(int EngineId) {
        this.EngineId = EngineId;
    }
    public String getEngineName() {
        return EngineName;
    }
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }
    public String getEngineType() {
        return EngineType;
    }
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }
    public double getEnginePrice() {
        return EnginePrice;
    }
    public void setEnginePrice(double EnginePrice) {
        this.EnginePrice = EnginePrice;
    }

        
}
