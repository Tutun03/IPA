import java.util.Arrays;
import java.util.Scanner;

public class ipa29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sim2[] sm1=new Sim2[4];
        for(int i=0;i<sm1.length;i++)
        {
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            double d=sc.nextDouble();sc.nextLine();
            String e=sc.nextLine();
            sm1[i]=new Sim2(a,b,c,d,e);
        }
        String search_circle=sc.nextLine();
        double search_rate=sc.nextDouble();sc.nextLine();
        Sim2[] ans= matchAndSort(sm1,search_circle,search_rate);
        if(ans!=null)
        {
            for(int i=0;i<ans.length;i++)
            {
                System.out.println(ans[i].getId());
            }
        }
        else{
            System.out.println();
        }
    }
    public static Sim2[] matchAndSort(Sim2[] sm4,String search_circle,double search_rate)
    {
        Sim2[] sm5=new Sim2[0];
        Sim2 del;
        for(int i=0;i<sm4.length;i++)
        {
            if(sm4[i].getCircle().equalsIgnoreCase(search_circle) && sm4[i].getRatePerSecond()<search_rate)
            {
                sm5=Arrays.copyOf(sm5,sm5.length+1);
                sm5[sm5.length-1]=sm4[i];
            }
        }
        for(int i=0;i<sm5.length;i++)
        {
            for(int j=i;j<sm5.length;j++)
            {
                if(sm5[i].getBalance()<sm5[j].getBalance())
                {
                    del=sm5[i];
                    sm5[i]=sm5[j];
                    sm5[j]=del;
                }
            }
        }
        if(sm5.length>0)
        {
            return sm5;
        }
        else{
            return null;
        }
    }
}
class Sim2{
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;
    public Sim2(int id,String company,int balance, double ratePerSecond,String circle)
    {
        this.id=id;
        this.company=company;
        this.balance=balance;
        this.ratePerSecond=ratePerSecond;
        this.circle=circle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getRatePerSecond() {
        return ratePerSecond;
    }
    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }
    public String getCircle() {
        return circle;
    }
    public void setCircle(String circle) {
        this.circle = circle;
    }
    

    
}