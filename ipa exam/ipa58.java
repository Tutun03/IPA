import java.util.Scanner;

public class ipa58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] sp=new Student[2];
        Faculty[]fp=new Faculty[2];
        for(int i=0;i<sp.length;i++)
        {
          String f1=sc.nextLine();
          String l1=sc.nextLine();
          int a1=sc.nextInt();sc.nextLine();
          char g1=sc.next().charAt(0);sc.nextLine();
          String e1=sc.nextLine();
          String c1=sc.nextLine();
          int d=sc.nextInt();sc.nextLine();
          double s1=sc.nextDouble();sc.nextLine();
          sp[i]=new Student(f1,l1,a1,g1,e1,c1,d,s1);
        }
        for(int i=0;i<fp.length;i++)
        {
          String f2=sc.nextLine();
          String l2=sc.nextLine();
          int a2=sc.nextInt();sc.nextLine();
          char g2=sc.next().charAt(0);sc.nextLine();
          String e2=sc.nextLine();
          String c2=sc.nextLine();
          String d2=sc.nextLine();
          double s1=sc.nextDouble();sc.nextLine();
          fp[i]=new Faculty(f2,l2,a2,g2,e2,c2,d2,s1);
        }
        Student ans=findHighestGPAStudent(sp);
        System.out.println(ans.getRollNo());
        System.out.println(ans.getCourse());
        System.out.println(ans.getGpa());
    }
    public static Student findHighestGPAStudent(Student[] students)
    {
        Student temp;
        for(int i=0;i<students.length;i++)
        {
            for(int j=i;j<students.length;j++)
            {
                if(students[i].getGpa()<students[j].getGpa())
                {
                    temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
        }
        if(students.length>0)
        {
            return students[0];
        }
        else{
            return null;
        }
    }
}

class Person{
    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    public Person(String firstName,String lastName,int age,char gender)
{
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.gender=gender;
}
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

}


class Student extends Person{
private String rollNo;
private String course;
private int semester;
private double gpa;
public Student(String firstName,String lastName,int age,char gender,String rollNo,String course,int semester,double gpa)
{
    super(firstName,lastName,age,gender);
    this.rollNo=rollNo;
    this.course=course;
    this.semester=semester;
    this.gpa=gpa;
}
public String getRollNo() {
    return rollNo;
}
public void setRollNo(String rollNo) {
    this.rollNo = rollNo;
}
public String getCourse() {
    return course;
}
public void setCourse(String course) {
    this.course = course;
}
public int getSemester() {
    return semester;
}
public void setSemester(int semester) {
    this.semester = semester;
}
public double getGpa() {
    return gpa;
}
public void setGpa(double gpa) {
    this.gpa = gpa;
}



}

class Faculty extends Person{
private String employeeId;
private String department;
private String designation;
private double salary;

public Faculty(String firstName,String lastName,int age,char gender,String employeeId,String department,String designation,double salary)
{
    super(firstName,lastName,age,gender);
    this.employeeId=employeeId;
    this.department=department;
    this.designation=designation;
    this.salary=salary;
}

public String getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
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