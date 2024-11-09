import java.util.Scanner;

public class ipa35 {
    public static void main(String[] args) {
        Institution ib[] = new Institution[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ib.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            ib[i] = new Institution(a, b, c, d, e);
        }
        String loc = sc.nextLine();
        String name = sc.nextLine();
        int sum = FindNumClearanceByLoc(ib, loc);
        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }
        Institution ans = UpdateInstitutionGrade(ib, name);
        if(ans!=null){
            System.out.println(ans.getinstitutionName()+"::"+ans.getgrade());
        }
        else{
           System.out.println("\"No Institute is available with the specified name"); 
        }
    }

    public static int FindNumClearanceByLoc(Institution lb[], String loc) {
        int sum = 0;
        for (int i = 0; i < lb.length; i++) {
            if (lb[i].getlocation().equals(loc)) {
                sum = sum + lb[i].getnoOfStudentsCleared();
            }
        }
        if (sum > 0) {
            return sum;
        } else {
            return 0;
        }
    }

    public static Institution UpdateInstitutionGrade(Institution lb[], String name) {
        if (lb.length == 0) {
            return null; 
        }
    
        for (int i = 0; i < lb.length; i++) {
            if (lb[i].getinstitutionName().equals(name)) {
                int pogo = (lb[i].getnoOfStudentsPlaced() * 100) / lb[i].getnoOfStudentsCleared();
                if (pogo >= 80) {
                    lb[i].setgrade("A");
                } else {
                    lb[i].setgrade("B");
                }
                return lb[i]; 
            }
        }
    
        return null; // Return null if no institution matches the name
    }
    
}

class Institution {
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared,
            String location) {

        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.location = location;
    }

    public void setgrade(String grade) {
        this.grade = grade;

    }

    public void institutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public void institutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void noOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public void noOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public void location(String location) {
        this.location = location;
    }

    public int getinstitutionId() {
        return institutionId;
    }

    public String getinstitutionName() {
        return institutionName;
    }

    public int getnoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getnoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getlocation() {
        return location;

    }

    public String getgrade() {
        return grade;
    }

}
