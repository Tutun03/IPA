
import java.util.*;
public class ipa25 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Associate cd[]=new Associate[5];
       for(int i=0;i<cd.length;i++)
       {
        int a=sc.nextInt();sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        int d=sc.nextInt();sc.nextLine();
        cd[i]=new Associate(a,b,c,d);
       }
       String st=sc.nextLine();
       Associate[] al=associatesForGivenTechnology(cd,st);
       
       if(al!=null)
       {
        for(int i=0;i<al.length;i++)
        {
            System.out.println(al[i].getid());
        }
       }
      
      
    }

    public  static Associate[]  associatesForGivenTechnology(Associate[] cd1,String st1)
    {
        Associate[] vk=new Associate[0];
        for(int i=0;i<cd1.length;i++)
        {
            if(cd1[i].gettechnology().equalsIgnoreCase(st1) && (ck[i].getexperienceinYears() %5==0))
            {
                vk=Arrays.copyOf(vk,vk.length+1);
                vk[vk.length-1]=cd[i];
            }
        }
        if(vk.length>0)
        {
            return vk;
        }
        else{
            return null;
        }
    }
}
class  Associate{
    private int id;
    private String name;
    private String technology;
    private int experienceinYears;

    public Associate(int id,String name,String technology, int experienceinYears){
        this.id=id;
        this.name=name;
        this.technology=technology;
        this.experienceinYears=experienceinYears;
    }
    public int  getid(){
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String gettechnology()
    {
       return technology;
    }
    public int getexperienceinYears()
    {
        return experienceinYears;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public void setname(String name)

    {
        this.name=name;
    }
    public void settechnology(String technology)
    {
        this.technology=technology;
    }
    public void setexperienceinYears(String experienceinYears)
    {
        this.experienceinYears=experienceinYears;
    }
}