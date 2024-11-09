import java.util.Arrays;
import java.util.*;
// public class ipa_exam {
    public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Student[]s= new Student[a];
        for(int i=0;i<s.length;i++)
        {
            int a1=sc.nextInt();sc.nextLine();
            String a2=sc.nextLine();
            int a3=sc.nextInt();
            s[i]=new Student(a1,a2,a3);
        }
        Student[] ans=findStudentWithhighestTotal(s);
        if(ans!=null)
        {
            for(int i=0;i<ans.length;)
            {
                System.out.println(ans[i].getName().toUpperCase());
                break;

            }
        }
        Student []ans2=searchStudentsBypercentage(s);
        if(ans2!=null)
        {
            for(int i=0;i<ans2.length;i++)
            {
                System.out.println(ans2[i].getId());
            }
        }
       
    }
    public static Student[] findStudentWithhighestTotal(Student[] s1)
    {
        Student[] ap=new Student[0];
        Student del;
        for(int i=0;i<s1.length;i++)
        {
            ap=Arrays.copyOf(ap, ap.length+1);
            ap[ap.length-1]=s1[i];
        }
        for(int i=0;i<ap.length;i++)
        {
            for(int j=i;j<ap.length;j++)
            {
                if(ap[i].getTotmarksobt()<ap[j].getTotmarksobt())
                {
                    del=ap[i];
                    ap[i]=ap[j];
                    ap[j]=del;
                }
            }
        }
        if(ap.length>0)
        {
            return ap;
        }
        else{
            return null;
        }
    }
    
    public static Student[] searchStudentsBypercentage(Student[] s2)
    {
        Student[] ap1=new Student[0];
        Student del1;
        for(int i=0;i<s2.length;i++)
        {
            if(((s2[i].getTotmarksobt()*100)/400)>=70)
            {
                ap1=Arrays.copyOf(ap1, ap1.length+1);
                ap1[ap1.length-1]=s2[i];
            }
        }
        for(int i=0;i<ap1.length;i++)
        {
            for(int j=i;j<ap1.length;j++)
            {
                if(ap1[i].getId()>ap1[j].getId())
                {
                    del1=ap1[i];
                    ap1[i]=ap1[j];
                    ap1[j]=del1;
                }
            }
        }
        if(ap1.length>0)
        {
            return ap1;
        }
        else{
            return null;
        }
    }
}
class Student{
    private int id;
    private  String name;
    private int totmarksobt;

    public Student(int id,String name,int totmarksobt)
    {
        this.id=id;
        this.name=name;
        this.totmarksobt=totmarksobt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotmarksobt() {
        return totmarksobt;
    }

    public void setTotmarksobt(int totmarksobt) {
        this.totmarksobt = totmarksobt;
    }
    
}