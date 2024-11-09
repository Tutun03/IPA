import java.util.Scanner;

public class ipa26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=sc.nextInt();sc.nextLine();
        double c=sc.nextDouble();sc.nextLine();
        Employee e= new Employee(a, b, c);
        double ans=calculateYearlySalary(e);
        System.out.println(ans);
        double ans1=calculateTax(e);
        System.out.println(ans1);

    }
    public static double calculateYearlySalary(Employee e)
    {
        return e.getsalary()*12;
    }
    public static double calculateTax(Employee e)
    {
        if((e.getsalary()*12)<=50000)
        {
            return(( e.getsalary()*12*10)/100);
        }
        else if((e.getsalary()*12)>5000 && (e.getsalary()*12)<=100000)
        {
            return(((( 50000*10)/100)) +((((e.getsalary()*12)-50000)*20)/100));
        }
        else if((e.getsalary()*12)>100000){
            return(((( 50000*10)/100)) +((( 50000*20)/100))+((((e.getsalary()*12)-100000)*30)/100));
        }
        return 0;
    }
}
class Employee{
    private String name;
    private int age;
    private double salary;
     public Employee(String name,int age,double salary)
     {
        this.name=name;
        this.age=age;
        this.salary=salary;
     }
     public double getsalary()
     {
        return salary;
     }
     public int getage()
     {
        return  age;
     }
     public  String getname()
     {
        return name;
     }
     public void setname(String name)
     {
        this.name=name;

     }
     public void setage(int age)
     {
        this.age=age;
     }
     public void setsalary(double salary)
     {
        this.salary=salary;
     }
}
