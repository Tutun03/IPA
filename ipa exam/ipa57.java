import java.util.Arrays;
import java.util.Scanner;

public class ipa57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cpn=sc.nextLine();
        int no=sc.nextInt();sc.nextLine();
        Employee a1[]=new Employee[3];
        
        for(int i=0;i<a1.length;i++){
          int a=sc.nextInt();sc.nextLine();
          String b=sc.nextLine();
          String c=sc.nextLine();
          double d=sc.nextDouble();sc.nextLine();
          a1[i]=new Employee(a,b,c,d);

        }
        Company c1=new Company(cpn,no,a1);

        double ans=c1.getaverageSalary(a1);
                System.out.println(ans);
        
               double ans1=Company.getMaxSalary(a1);
                System.out.println(ans1);
                String de=sc.nextLine();
                Employee[] ans2=Company.getEmployeeByDesignation(a1,de);
                if(ans2.length!=0)
                {
                   for(int i=0;i<ans2.length;i++){
                    {
                        System.out.println(ans2[i].getId());
                    }
                }
            }
           
        
        
            }
        
        
        
        }
        
        class Employee{
            private int id;
            private String name;
            private String designation;
            private double salary;
        
            public Employee(int id, String name, String designation, double salary) {
                
                    this.id = id;
                    this.name = name;
                    this.designation = designation;
                    this.salary = salary;
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
            private String companyName;
            private Employee[] employees;
            private int numberEmployees;
            public Company(String companyName, int numberEmployees,Employee[] employees) {
        
                this.companyName = companyName;
                this.employees = employees;
                this.numberEmployees = numberEmployees;
            }
            public String getCompanyName() {
                return companyName;
            }
            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }
            public Employee[] getEmployees() {
                return employees;
            }
            public void setEmployees(Employee[] employees) {
                this.employees = employees;
            }
            public int getNumberEmployees() {
                return numberEmployees;
            }
            public void setNumberEmployees(int numberEmployees) {
                this.numberEmployees = numberEmployees;
            }
        
            public double getaverageSalary(Employee a1[]){
        double sum=0.0;
        double count=0.0;
         for(int i=0;i<a1.length;i++){
         sum=sum+a1[i].getSalary();
         count++;
     
     }
     if(count>0.0)
     {
         return sum/count;
     }
     else{
         return 0.0;
     }

    }

    public static double getMaxSalary(Employee a1[]){

        double max=-9999999999999.99999;
        for(int i=0;i<a1.length;i++){
            if(a1[i].getSalary()>max){
                max=a1[i].getSalary();
            }
        
        
        }
        return max;
    }
    
    public static Employee[] getEmployeeByDesignation(Employee a1[],String de){
    Employee[] ans=new Employee[0];
    for(int i=0;i<a1.length;i++){

        if(a1[i].getDesignation().equals(de)){
            ans=Arrays.copyOf(ans, ans.length+1);
            ans[ans.length-1]=a1[i];
        }
    }
    if(ans.length>0)
    {
        return ans;
    }
    else{
        return null;
    }
}
}
