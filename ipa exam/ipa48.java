import java.util.Scanner;
import java.util.*;
public class ipa48 {
    public static void main(String[] args) {
        newspaper[] np=new newspaper[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<np.length;i++){
          int a=sc.nextInt();
          sc.nextLine();
          String b=sc.nextLine();
          int c=sc.nextInt();
          sc.nextLine();
          int d=sc.nextInt();
          sc.nextLine();
          np[i]=new newspaper(a,b,c,d);
        }
        int p=sc.nextInt();sc.nextLine();
        String n3=sc.nextLine();
        int ans=findTotalPriceByPublicationYear(np,p);
        if(ans!=0)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println("No Newspaper found with the mentioned attribute");
        }
        newspaper ans1=searchNewspaperByName(np,n3);
        if(ans1!=null)
        {
            System.out.println(ans1.getregNo());
            System.out.println(ans1.getname());
            System.out.println(ans1.getpublicationYear());
            System.out.println(ans1.getprice());
        }
        else{
            System.out.println("No Newspaper found with the given name.");
        }

    }
    public static int  findTotalPriceByPublicationYear(newspaper[]np1,int p1)
    {
        int sum=0;
        for(int i=0;i<np1.length;i++)
        {
            if(np1[i].getpublicationYear()==p1)
            {
               sum=sum+np1[i].getprice();
            }
        }
        if(sum>0)
        {
            return sum;
        }
        else{
            return 0;
        }
    }

    public static newspaper searchNewspaperByName(newspaper[]np2,String n2)
    {
        
        for(int i=0;i<np2.length;i++)
        {
            if (np2[i].getname().equalsIgnoreCase(n2))
            {
                return np2[i];
            }
        }
        return null;

    }
}

class newspaper{
    private int regNo;
    private String name;
    private int publicationYear;
    private int price;

    public newspaper(int regNo, String name,int publicationYear, int price){
    this.regNo=regNo;
    this.name=name;
    this.publicationYear=publicationYear;
    this.price=price;
    }
    public int getregNo()
    {
        return regNo;
    }
    public void setregNo(int regNo)
    {
        this.regNo=regNo;
    }
    public int getpublicationYear(){
        return publicationYear;
    }
    public void setpublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }
    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price=price;
    }

    public String getname(){
    return name;
    }
    public void setname(String name){
        this.name=name;
    }
 

}
