// import java.util.Arrays;
// import java.util.Scanner;

// public class ipa24 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         Footware [] f=new Footware[5];
//         for(int i=0;i<f.length;i++)
//         {
//             int a=sc.nextInt();sc.nextLine();
//             String b=sc.nextLine();
//             String c=sc.nextLine();
//             int d=sc.nextInt();sc.nextLine();
//             f[i]=new Footware(a,b,c,d);
//         }
//         String ft=sc.nextLine();
//         String fn=sc.nextLine();
//         int ans=getCountByType(f,ft);
//         if(ans!=0)
//         {
//             System.out.println(ans);
//         }
//         else{
//             System.out.println("Footware not available");
//         }
//         // Footware ans1=getSecondHighestPriceByBrand(f,fn);
//         Footware[] ans1=getSecondHighestPriceByBrand(f,fn);
//         // if(ans1!=null)
//         // {
//         //     System.out.println(ans1.getFootwareId());
//         //     System.out.println(ans1.getFootwareName());
//         //     System.out.println(ans1.getPrice());
//         // }
//         // else
//         // {
//         //     System.out.println("Brand not available");
//         // }
//         if(ans1!=null)
//         {
//         for(int i=0;i<ans1.length;i++)
//         {
//             if(ans1[i].getPrice()>ans1[i+1].getPrice())
            
//             {
//                System.out.println(ans1[i].getFootwareId());
//                System.out.println(ans1[i].getFootwareName());
//                System.out.println(ans1[i].getPrice());
//                break;
//             }
//         }
//     }
//     else
//     {
//         System.out.println("Brand not available");
//     }
       
//     }

//     public static int  getCountByType(Footware[] fi,String ft1)
//     {
//         int count=0;
//         for(int i=0;i<fi.length;i++)
//         {
//             if(fi[i].getFootwareType().equalsIgnoreCase(ft1))
//             {
//                 count++;
//             }
//         }
//         if(count>0)
//         return count;
//         else{
//             return 0;
//         }
//     }
//     public static Footware getSecondHighestPriceByBrand(Footware[] fi1,String fn1)
//     {
//      Footware sap[]=new Footware[0];
//      Fottware del=0;
//      for(int i=0;i<fi1.length;i++)
//      {
//         if(fi1[i].getFootwareName().equalsIgnoreCase(fn1))
//         {
//             sap=Arrays.copyOf(sap, sap.length+1);
//             // sap[sap.length-1]=fi1[i].getPrice();
//             sap[sap.length-1]=fi1[i];
//         }
//      }
//     //  Arrays.sort(sap);
//     //  int x=sap[sap.length-2];
//     //  for(int i=0;i<fi1.length;i++)
//     //  {
//     //     if(fi1[i].getPrice()==x)
//     //     {
//     //         return fi1[i];
//     //     }
//     //  }
//     // return null;
//     for(int i=0;i<sap.length;i++)
//     {
//         for(int j=i;j<sap.length;j++)
//         {
//             if(sap[i].getPrice()<sap[j].getPrice())
//             {
//                 del=sap[i];
//                 sap[i]=sap[j];
//                 sap[j]=del;
//             }
//         }
//     }
//     if(sap.length>0)
//     {
//         return sap;
//     }
//     else{
//         return null;
//     }
//     }

// }



// class Footware{
//     private int FootwareId;
//     private String FootwareName;
//     private String FootwareType;
//     private int price;
//     public Footware(int FootwareId,String FootwareName,String FootwareType,int price){
//         this.FootwareId=FootwareId;
//         this.FootwareName=FootwareName;
//         this.FootwareType=FootwareType;
//         this.price=price;
//     }
//     public int getFootwareId() {
//         return FootwareId;
//     }
//     public void setFootwareId(int footwareId) {
//         FootwareId = footwareId;
//     }
//     public String getFootwareName() {
//         return FootwareName;
//     }
//     public void setFootwareName(String footwareName) {
//         FootwareName = footwareName;
//     }
//     public String getFootwareType() {
//         return FootwareType;
//     }
//     public void setFootwareType(String footwareType) {
//         FootwareType = footwareType;
//     }
//     public int getPrice() {
//         return price;
//     }
//     public void setPrice(int price) {
//         this.price = price;
//     }
    


// }

import java.util.*;


public class ipa24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Footware [] f=new Footware[5];
        for(int i=0;i<f.length;i++)
        {
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            f[i]=new Footware(a,b,c,d);
        }
        String ft=sc.nextLine();
        String fn=sc.nextLine();
        int ans=getCountByType(f,ft);
        if(ans!=0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("Footware not available");
        }
    
        Footware[] ans1=getSecondHighestPriceByBrand(f,fn);

        if(ans1!=null)
        {
        for(int i=0;i<ans1.length;i++)
        {
            if(ans1[i].getPrice()>ans1[i+1].getPrice())
            
            {
               System.out.println(ans1[i+1].getFootwareId());
               System.out.println(ans1[i+1].getFootwareName());
               System.out.println(ans1[i+1].getPrice());
              break;
            }
        }
    }
    else
    {
        System.out.println("Brand not available");
    }
       
    }

    public static int  getCountByType(Footware[] fi,String ft1)
    {
        int count=0;
        for(int i=0;i<fi.length;i++)
        {
            if(fi[i].getFootwareType().equalsIgnoreCase(ft1))
            {
                count++;
            }
        }
        if(count>0)
        return count;
        else{
            return 0;
        }
    }
    public static Footware[] getSecondHighestPriceByBrand(Footware[] fi1,String fn1)
    {
     Footware sap[]=new Footware[0];
     Footware del;
     for(int i=0;i<fi1.length;i++)
     {
        if(fi1[i].getFootwareName().equalsIgnoreCase(fn1))
        {
            sap=Arrays.copyOf(sap, sap.length+1);
            
            sap[sap.length-1]=fi1[i];
        }
     }
    
    for(int i=0;i<sap.length;i++)
    {
        for(int j=i;j<sap.length;j++)
        {
            if(sap[i].getPrice()<sap[j].getPrice())
            {
                del=sap[i];
                sap[i]=sap[j];
                sap[j]=del;
            }
        }
    }
    if(sap.length>0)
    {
        return sap;
    }
    else{
        return null;
    }
    }

}



class Footware{
    private int FootwareId;
    private String FootwareName;
    private String FootwareType;
    private int price;
    public Footware(int FootwareId,String FootwareName,String FootwareType,int price){
        this.FootwareId=FootwareId;
        this.FootwareName=FootwareName;
        this.FootwareType=FootwareType;
        this.price=price;
    }
    public int getFootwareId() {
        return FootwareId;
    }
    public void setFootwareId(int footwareId) {
        FootwareId = footwareId;
    }
    public String getFootwareName() {
        return FootwareName;
    }
    public void setFootwareName(String footwareName) {
        FootwareName = footwareName;
    }
    public String getFootwareType() {
        return FootwareType;
    }
    public void setFootwareType(String footwareType) {
        FootwareType = footwareType;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    


}