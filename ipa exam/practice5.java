import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   Player p[]=new Player[4];
   for(int i=0;i<p.length;i++)
   {
    int a=sc.nextInt();
    int b=sc.nextInt();
    String c=sc.nextLine();
    String d=sc.nextLine();
    p[i]=new Player(a, c,d,b);
   }
   String sk=sc.nextLine();
   String sl=sc.nextLine();
   int sum=findPointsForGivenSkill(p,sk);
 
   if(sum!=0)
   {
    System.out.println(sum);
   }
   else{
    System.out.println("skill is not present");
   }
   int plo=getPlayerBasedOnLevel(p,sl,sk);
   if(plo!=0)
   {
    System.out.println(plo);
   }
   else{
    System.out.println("No player is available with specified level, skill and eligibility points");
   }

}
public static findPointsForGivenSkill(Player [] plp,String zk)
{
    int sum=0;
    
     for(int i=0;i<plp.length;i++)
     {
        if(plp[i].getSkill().equalsIgnoreCase(zk))
        {
           sum=sum+plp[i].getPoints();
           
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

public static  getPlayerBasedOnLevel(Player[]po,String level,String skill)
      
{
    for(int i=0;i<po.length;i++)
    {
        if(po[i].getSkill().equalsIgnoreCase(skill) && po[i].getLevel().equalsIgnoreCase(level) &&po[i].getPoints()>=20)
        {
           return po[i].getPlayerId();
        }
    }
    return 0;
}
}

class Player{
    int playerId;
    String skill;
    String level;
    int points;

    public Player(int playerId,String skill,String level,int points)
    {
        this.level=level;
        this.playerId=playerId;
        this.points=points;
        this.skill=skill;
    }
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
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



    
    
    

