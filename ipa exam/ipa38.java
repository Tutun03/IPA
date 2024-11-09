import java.util.Scanner;
import java.util.Arrays;
public class ipa38 {
    public static void main(String[] args) {
        Student[] al=new Student[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<al.length;i++)
        {
          String a=sc.nextLine();
         
          String b=sc.nextLine();
          
          int c=sc.nextInt();sc.nextLine();
          
          char d=sc.next().charAt(0);sc.nextLine();
        
        String e=sc.nextLine();
        String f=sc.nextLine();
        int g=sc.nextInt();sc.nextLine();
        double h=sc.nextDouble();sc.nextLine();
        al[i]=new Student(e,f,g,h,a,b,c,d);
       

       
           
        }
        // Faculty[]al2=new Faculty[2];
        // for(int i=0;i<al2.length;i++)
        // {
        //     String a=sc.nextLine();
        //     al2[i].setFirstname(a);
        //     String b=sc.nextLine();
        //     al2[i].setLastname(b);
        //     int c=sc.nextInt();sc.nextLine();
        //     al2[i].setAge(c);
        //     char d=sc.next().charAt(0);sc.nextLine();
        //     al2[i].setGender(d);
        //     String e=sc.nextLine();
        //     String f=sc.nextLine();
        //     int g=sc.nextInt();sc.nextLine();
        //     double h=sc.nextDouble();sc.nextLine();
        //     al2[i]=new Faculty(e,f,g,h);
        // }

        Student ans=getStudentWithHighestGPA(al);
        if(ans!=null)
        {
            System.out.println(ans.getRollNo());
            System.out.println(ans.getCourse());
            System.out.println(ans.getGpa());
        }
        else{
            System.out.println("Sorry - No student is available");
        }


        
}

public static Student getStudentWithHighestGPA(Student[] students) {
   if(students.length!=0)
   {
    Arrays.sort(students);
    return students[students.length-1];
   }
   return null;
}
}
class Person{
    private String firstname;
    private String lastname;
    private int age;
    private char gender;

    public Person(String firstname, String lastname, int age, char gender) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
class Employee extends Person{
    private double salary;
    private String department;

 public Employee(double salary, String department) {
    super();
    this.salary = salary;
this.department = department;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

 }


 class Student extends Person implements Comparable<Student> {
    
    private String rollNo;
    private String course;
    private int semester;
    private double gpa;

    public Student(String rollNo, String course, int semester, double gpa, String firstname, String lastname, int age, char gender) {
        // Call the constructor of the superclass (Person)
        super(firstname, lastname, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.gpa = gpa;
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
    public int compareTo(Student other) {
        // Compare by GPA
        return Double.compare(this.gpa, other.gpa);
    }
}

    
  
