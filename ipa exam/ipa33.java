import java.util.Arrays;
import java.util.Scanner;

public class ipa33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter company name: ");
        String a=sc.nextLine();
        System.out.print("Enter number of employees");
        int c=sc.nextInt();
        System.out.println("Enter employee details");
        Employee[] ab=new Employee[c];
        int count=0;
        for(int i=0;i<ab.length;i++)

        {
            count=count+1;
           System.out.println("Employee "+count);
           System.out.print("Enter id: ");
           int a1=sc.nextInt();sc.nextLine();
           System.out.print("Enter name: ");
           String a2=sc.nextLine();
           System.out.print("Enter Designation: ");
           String a3=sc.nextLine();
           System.out.print("Enter salary: ");
           double a4=sc.nextDouble();sc.nextLine(); 
           ab[i]=new Employee(a1, a2, a3, a4);

        }
        Company b=new Company(a, ab, c);
        double ans=getAverageSalary(ab);
        System.out.println("Average salary: "+ ans);
        double ans2=getMaxSalary(ab);
        System.out.println("Max Salary: "+ans2);
        System.out.println("Employees with designation: ");
        String e=sc.nextLine();
        Employee[]ans3=getEmployeesByDesignation(ab,e);
        for(int i=0;i<ans3.length;i++)
        {
            System.out.println("ID: "+ans3[i].getId()+", "+"Name: "+ans3[i].getName()+", "+"Designation: "+ans3[i].getDesignation()+", "+"Salary: "+ans3[i].getSalary());
        }
    }

    public static double getAverageSalary(Employee[] ab)
    {
        double sum=0;
        for(int i=0;i<ab.length;i++)
        {
            sum+=ab[i].getSalary();
        }
        double avg=sum/ab.length;
        
        return  avg;
    }
    public static double getMaxSalary(Employee[] ab)
    {
        double s=ab[0].getSalary();
        for(int i=0;i<ab.length;i++)
        {
            if(ab[i].getSalary()>s)
            {
                s=ab[i].getSalary();
            }
        }
        return s;
    }
    public static Employee[] getEmployeesByDesignation(Employee[] ab,String e)
    {
            Employee[] ak=new Employee[0];
            for(int i=0;i<ab.length;i++)
            {
                if(ab[i].getDesignation().equalsIgnoreCase(e))
                {
                    ak=Arrays.copyOf(ak, ak.length+1);
                    ak[ak.length-1]=ab[i];
                    
                }
             }
             if(ak.length>0)
             {
                 return ak;

                }
                else{
                    return null;
                }
}
}

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;
    public Employee(int id,String name, String designation,double salary)
    {
        this.salary=salary;
        this.name=name;
        this.designation=designation;
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public void setId(in id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

class Company{
    String companyName;
    Employee[] employee;
    int numEmployees;

    public Company(String companyName,Employee[]employee,int numEmployees)
    {
        this.companyName=companyName;
        this.employee=employee;
        this.numEmployees=numEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }
    
}
