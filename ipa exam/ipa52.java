import java.util.Scanner;
import java.util.Arrays;
public class ipa52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        projector[] p1=new projector[4];
        for(int i=0;i<p1.length;i++)
        {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();
            sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            String e=sc.nextLine();
            p1[i]=new projector(a,b,c,d,e);
        }
        int rating=sc.nextInt();sc.nextLine();
        projector ans=findMaximumPriceByRating(p1,rating);
        if(ans!=null)
        {
            System.out.println(ans.getProjectId());
        }
        else{
            System.out.println("no such projector");
        }
    }
    public static projector findMaximumPriceByRating(projector[] p1,int rating)
    {
        projector[] p2=new projector[0];
        projector temp;
        for(int i=0;i<p1.length;i++)
        {
            if(p1[i].getRating()>rating && p1[i].getAvailableIn().equalsIgnoreCase("TataCliq"))
            {
                p2=Arrays.copyOf(p2,p2.length+1);
                p2[p2.length-1]=p1[i];
            }
        }
        for(int i=0;i<p2.length;i++)
        {
            for(int j=i;j<p2.length;j++)
            {
                if(p2[i].getPrice()<p2[j].getPrice())
                {
                    temp=p2[i];
                    p2[i]=p2[j];
                    p2[j]=temp;
                }
            }
        }
        if(p2.length>0)
        {
            return p2[0];
        }
        else{
            return null;
        }
    }
}
class projector{
    private int projectId;
    private String projectName;
    private  int price;
    private int rating;
    private String availableIn;
    public projector(int projectId,String projectName,int price,int rating,String availableIn)
    {
        this.projectId=projectId;
        this.projectName=projectName;
        this.price=price;
        this.rating=rating;
        this.availableIn=availableIn;
    }
    public int getProjectId() {
        return projectId;
    }
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getAvailableIn() {
        return availableIn;
    }
    public void setAvailableIn(String availableIn) {
        this.availableIn = availableIn;
    }   
}
