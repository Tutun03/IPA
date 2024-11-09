import java.util.*;
public class ipa28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Medicine[]md=new Medicine[4];
        for(int i=0;i<md.length;i++)
        {
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c= sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            md[i]=new Medicine(a, b, c, d);

            
        }
        String e=sc.nextLine();
        int[] ans= getPriceByDisease(md,e);
        if(ans.length!=0)
        {
            for(int i=0;i<ans.length;i++)
            {
                System.out.println(ans[i]);
            }
        }
      
    }

    public static int[] getPriceByDisease(Medicine[] md1, String e1)
    {
        int[] md2= new int[0];
     
        for(int i=0;i<md1.length;i++)
        {
            if(md1[i].getDisease().equalsIgnoreCase(e1))
            {
                md2=Arrays.copyOf(md2, md2.length+1);
                md2[md2.length-1]=md1[i].getPrice();
            }
        }
        Arrays.sort(md2);
        if(md2.length>0)
        {
            return md2;
        }
        else{
            return null;
        }

    }
}

class Medicine{
    private String MedicineName;
    private String batch;
    private String disease;
    private int price;
    public Medicine(String MedicineName,String batch,String disease,int price)
    {
        this.MedicineName=MedicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }
    public String getMedicineName() {
        return MedicineName;
    }
    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}