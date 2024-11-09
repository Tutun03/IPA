import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ilp19 {

    public static void main(String[] args) {
        Employee[] emp= new Employee[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;emp.length;i++)
        {
            int a= sc.nextInt();
            String b=sc.nextLine();
            boolean c= sc.nextBoolean();
            String d=sc.nextLine();
            double e=sc.nextDouble();
            emp[i]=new Employee(a, d, e, b, c);
        }
        String br=sc.nextLine();
        int ans1=CountOfEmployee(emp,br);
        if(ans1==0)
        {
            System.out.println("no such employees");
        }
        else{
            System.out.println(ans1);
        }

        Employee [] al =EmployeeWithSecondHighestRating(emp);
        if(al!=null)
    {
          for(int i=0;i<al.length;i++)
          {
            if(al[i].isRating()>al[i+1].isRating())
            {
                System.out.println(al[i+1].getEmployeeId());
                System.out.println(al[i+1].getName());
                break;
            }
          }
    }
    else{
        System.out.println("All Employees using company transport");
    }    
}

public static Employee[] EmployeeWithSecondHighestRating(Employee[] emp)
{
    Employee [] sec= new Employee[0];
    Employee des;
    for(int i=0;i<emp.length;i++)
    {
        sec=Arrays.copyOf(sec, sec.length+1);
        sec[sec.length-1]= emp;
    }
    // Arrays.sort(sec, Comparator.comparing(Employee::isRating).reversed());
for(int i=0;i<sec.length;i++)
{
    for(int j=i;j<sec.length;j++)
    {
        if(sec[i].isRating()<sec[j].isRating())
        {
           des=sec[i];
           sec[i]=sec[j];
           sec[j]=des;
        }
    }
    if(sec.length>0)
    {
        return sec;
    }
    else
    {
        return null;
    }
}

}

    public static int CountOfEmployee(Employee e[],String br)
    {
        int count=0;
        for(int i=0;i<e.length;i++)
        {
            if(e[i].getBranch().equalsIgnoreCase(br)&& e[i].isCompany_Transport==true)
            {
                count++;
            }
        }
        if(count=0)
        {
            return 0;
        }
        else{
            return count;
        }
    }
}

class Employee{
    private int employeeId;
    private String name;
    private  double rating;
    private String branch;
    private boolean company_Transport;
    
    public Employee(int employeeId,String name, double rating,String branch,boolean company_Transport)
    {
     this.branch=branch;
     this.company_Transport=company_Transport;
     this.employeeId=employeeId;
     this.name=name;
     this.rating=rating;
    }
    public double isRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void setCompany_Transport(boolean company_Transport) {
        this.company_Transport = company_Transport;
    }
    public String getBranch() {
        return branch;
    }
    public boolean isCompany_Transport() {
        return company_Transport;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }

 
    
}