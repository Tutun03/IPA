import java.util.Arrays;
import java.util.*;
public class ipa19 {
    public static void main(String[] args) {
        course[] cd= new course[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;cd.length;i++)
        {
            int a=sc.nextInt();
            String  b=nextLine();
            String c=nextLine();
            int quiz=d.nextInt();
            int handson=e.nextInt();
            cd[i]=new course(a, b, c, quiz, handson);
        }
        String c=sc.nextLine();
        int hand=sc.nextInt();
        int avg=findAvgOfQuizByAdmin(cd,c);
        course[]c1=sortCourseByHandsOn(cd,hand);
        if(avg!=0)
        {
            System.out.println(avg);
        }
        else{
            System.out.println("no course found");
        }
        
        if(c1!=null)
        {
            for(int i=0;i<c1.length;i++)
            {
                System.out.println(c1[i].getCourseName());
            }
        }
        else{
            System.out.println("no No Course found with mentioned attribute.");
        }
        


    }

    public static course[] sortCourseByHandsOn(course[] ck,int handson)
    {
      course[] s=new course[0];
      for(int i=0;i<ck.length;i++)
      {
        if(ck[i].getHandson()<handson)
        {
            s=  Arrays.copyOf(s, s.length+1);
            s[s.length-1]=ck[i];
        }
      }
      course val;
      for(int i=0;i<s.length;i++)
      {
        for(int j=i+1;j<s.length;i++)
        {
            if(s[i].getHandson()>s[j].getHandson())
            {
                val=s[i];
                s[i]=s[j];
                s[j]=val;
            }
        }
      }
      if(s.length>0)
      {
        return s;
      }
      else{
        return null;
      }
    }
    public static  course[] findAvgOfQuizByAdmin(course[] ck, String m)
        {
            int count=0;
            int sum=0;
            for(int i=0;i<ck.length;i++)
            {
                if(ck[i].getCourseAdmin().equalsIgnoreCase(m))
                {
                   sum=sum+ck[i].getQuiz();
                   count++;
                }
            }
            if(count>0)
            {
                int avg=sum/count;
                return avg;
            }
            else{
                return 0;
            }
        
        
        
        }
}
class course{
    int courseId;
    String courseName;
    String courseAdmin;
    int quiz;
    int handson;

    public course(int courseId,String courseName,String courseAdmin,int quiz,int handson)
    {
      this.courseAdmin=courseAdmin;
      this.courseId=courseId;
      this.courseName=courseName;
      this.quiz=quiz;
      this.handson=handson;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }
    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }
    public void setHandson(int handson) {
        this.handson = handson;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseAdmin() {
        return courseAdmin;
    }
    public int getQuiz() {
        return quiz;
    }
    public int getHandson() {
        return handson;
    }
    
    
}