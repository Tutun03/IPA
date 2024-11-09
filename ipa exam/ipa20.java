import java.util.Arrays;
import java.util.Scanner;

public class ipa20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Medicine[] md=new Medicine[4];
        for(int i=0;i<md.length;i++)
        {
            String a=sb.nextLine();
            String b=sb.nextLine();
            String c= sb.nextLine();
            String d=sb.nextLine();
            md[i]=new Medicine(a, b, d, c);
        }
        String d=sc.nextLine();
       int[] ans=getPriceByDisease(md,d);
       if(ans!=0)
       {
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]); 
            
        }
       }

    }

    public static getPriceByDisease(Medicine[] mk,String l)
    {
        int count=0;
        Medicine [] kl=new Medicine[0];
        for(int i=0;i<md.length;i++)
        {
            if(mk[i].getDisease().equalsIgnoreCase(l))
            {
            kl=Arrays.copyOf(kl, kl.length+1);
            kl[kl.length-1]=mk[i].getPrice();
            Arrays.sort(kl)  ;  
        }
        }
        if(kl.length>0)
        { 
    return kl;
        }
        else{
            return null;
        }
       
    }

}

class Medicine{
    String MedicineName;
    String batch;
    String disease;
    String price;
    public Medicine(String MedicineName,String batch, String  disease, String price){
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
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    
}

