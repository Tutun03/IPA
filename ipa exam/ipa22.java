import java.util.Arrays;
import java.util.Scanner;

public class ipa22 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Phone[] ph=new Phone[4];
       for(int i=0;i<ph.length;i++)
       {
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c=sc.nextLine();
        int d=sc.nextInt();
        ph[i]=new Phone(a,b,c,d);
       } 
       String l=sc.nextLine();
       String h=sc.nextLine();
       int ans=findPointsForGivenSkill(ph,l);
       if(ans!=0)
       {
        System.out.println(ans);

       }
       else{
        System.out.println("The given Skill is not available");
       }

       Player[] ans2=new getPlayerBasedOnLevel(ph,l,h);
       for(int i=0;i<ans2.length;i++)
       {
        System.out.println(ans2[i].getPhoneId);
       }
    }

    public  static int findPointsForGivenSkill(Phone[] lp,String po)
    {
        int sum=0;
        for(int i=0;i<lp.length;i++)
        {
           
            intr coumt=0;
            if(lp[i].getskills()==po)
            {
                sum=sum+lp[i].getPoints();
                count++;
            }
        }
        if(count>=0)
        {
            return sum;
        }
        else{
            return 0;
        }
    }
    public static Player[] getPlayerBasedOnLevel(Phone phlp[],String lm,String pok)
    {
        Player sk[]=new Phone[0];
        for(int i=0;i<phlp.length;i++)
        {
            if(phlp[i].getskills().equalsIgnoreCase(lm) && phlp[i].getLevel().equalsIgnoreCase(pok) && phlp[i].getPoints()>=20)
            {
               sk=Arrays.copyOf(sk, sk.length+1);
               sk[sk.length-1]=phlp[i];
            }
        }
        return sk;
    }
}

class Phone{
    private int phoneId;
    private String skills;
    private String level;
    private int points;


    public Phone(int phoneId,String skills,String level,int points)

    {
           this.level=level;
           this.skills=skills;
           this.phoneId=phoneId;
           this.points=points ;   
    }


    public int getPhoneId() {
        return phoneId;
    }


    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }


    public String getSkills() {
        return skills;
    }


    public void setSkills(String skills) {
        this.skills = skills;
    }


    public String getLevel() {
        return level;
    }


    public void setLevel(String level) {
        this.level = level;
    }


    public int getPoints() {
        return points;
    }


    public void setPoints(int points) {
        this.points = points;
    }
   
}
