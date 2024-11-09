import java.util.*;

public class ipa21 {
    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         AutonomousCar[] c = new AutonomousCar[4];
        
//         for (int i = 0; i < c.length; i++) {
//             int a = sc.nextInt(); // Read car ID
//             sc.nextLine(); // Consume the leftover newline character
            
//             String b = sc.nextLine(); // Read brand
            
//             int ck = sc.nextInt(); // Read number of tests conducted
//             int l = sc.nextInt(); // Read number of tests passed
//             sc.nextLine(); // Consume the leftover newline character
            
//             String p = sc.nextLine(); // Read environment
            
//             c[i] = new AutonomousCar(a, b, ck, l, p);
//         }

//         String env = sc.nextLine();
//         String br = sc.nextLine();

//         int ans = findTestPassedByEnv(c, env);
//         if (ans > 0) {
//             System.out.println(ans);
//         } else {
//             System.out.println("There are no tests passed in this particular environment");
//         }

//         AutonomousCar[] ans1 = updateCarGrade(c, br);
//         if(ans1!=null)
//         {
//            for(int i=0;i<ans1.length;i++)
//            {
//             int grade=(ans1[i].getNoOfTestsPassed()*100)/(ans1[i].getNoOfTestsConducted());
//             if(grade>=80)
//             {
//                 System.out.println(ans1[i].getBrand()+"::"+"A1");
//             }
//             else
//                 {
//                     System.out.println(ans1[i].getBrand()+"::B2");
//                 }
//            }
//         }
//         else{
//             System.out.println("No Car is available with the specified brand");
//         }
//     }

//     public static int findTestPassedByEnv(AutonomousCar[] caro, String env1) {
      
//         return 0;
//     }

//     public static AutonomousCar[] updateCarGrade(AutonomousCar[] car, String b) {
        
//         return car;
//     }
// }

// class AutonomousCar {
//     private int cardId;
//     private String brand;
//     private int noOfTestsConducted;
//     private int noOfTestsPassed;
//     private String environment;

//     public AutonomousCar(int cardId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
//         this.cardId = cardId;
//         this.brand = brand;
//         this.noOfTestsConducted = noOfTestsConducted;
//         this.noOfTestsPassed = noOfTestsPassed;
//         this.environment = environment;
//     }

//     // Getters and setters omitted for brevity

//     public int getCardId() {
//         return cardId;
//     }

//     public void setCardId(int cardId) {
//         this.cardId = cardId;
//     }

//     public String getBrand() {
//         return brand;
//     }

//     public void setBrand(String brand) {
//         this.brand = brand;
//     }

//     public int getNoOfTestsConducted() {
//         return noOfTestsConducted;
//     }

//     public void setNoOfTestsConducted(int noOfTestsConducted) {
//         this.noOfTestsConducted = noOfTestsConducted;
//     }

//     public int getNoOfTestsPassed() {
//         return noOfTestsPassed;
//     }

//     public void setNoOfTestsPassed(int noOfTestsPassed) {
//         this.noOfTestsPassed = noOfTestsPassed;
//     }

//     public String getEnvironment() {
//         return environment;
//     }

//     public void setEnvironment(String environment) {
//         this.environment = environment;
//     }
Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();  // Take input for 'x'

        for (int i = 1; i < x; i++) {
            int num = i;  // Store 'i' in a temporary variable 'num'
            int count = 0;

            // Count digits of 'num' without modifying 'i'
            while (num != 0) {
                num = num / 10;
                count++;
            }

            // Check if the number of digits is odd
            if (count % 2 != 0) {
                System.out.println("Number " + i + " has " + count + " digits.");
            }
        }
    }
}

