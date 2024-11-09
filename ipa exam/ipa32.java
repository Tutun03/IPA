// public class ipa32 {
//     public static void main(String[] args) {
//         Player3 []pogo=new Player3[4];

//     }
// }
// class Player3{
// private int id;
// private String name;
// private String Country;
// private int matchesPlayed;
// private int runsScored;


// public Player3(int i,String name,String Country,int matchesPlayed,int runsScored)
// {
//     this.id=i;
//     this.name=name;
//     this.Country=Country;
//     this.matchesPlayed=matchesPlayed;
//     this.runsScored=runsScored;
// }


// public int getId() {
//     return id;
// }


// public void setId(int id) {
//     this.id = id;
// }


// public String getName() {
//     return name;
// }


// public void setName(String name) {
//     this.name = name;
// }


// public String getCountry() {
//     return Country;
// }


// public void setCountry(String country) {
//     Country = country;
// }


// public int getMatchesPlayed() {
//     return matchesPlayed;
// }


// public void setMatchesPlayed(int matchesPlayed) {
//     this.matchesPlayed = matchesPlayed;
// }


// public int getRunsScored() {
//     return runsScored;
// }


// public void setRunsScored(int runsScored) {
//     this.runsScored = runsScored;
// }

// }
// import java.util.Scanner;

// public class ipa32 {
//     public static void main(String args[]) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         double b = sc.nextDouble();
//         double c = sc.nextDouble();
//         int noOfYears = sc.nextInt();
        
//         Account ab = new Account(a, b, c);
//         double ans = calculateInterest(ab, noOfYears);
//         System.out.format("%.3f",ans);
        
//         sc.close(); // Close the scanner to prevent resource leak
//     }
    
//     public static double calculateInterest(Account account, int noOfYears) {
//         double interest = ((account.getInterestRate() / 100 )* noOfYears)+account.getInterestRate();
//         return interest*10;
//     }
// }

// class Account {
//     private int id;
//     private double balance;
//     private double interestRate;
     
//     public Account(int id, double balance, double interestRate) {
//         this.id = id;
//         this.balance = balance;
//         this.interestRate = interestRate;
//     }
     
//     public int getId() {
//         return id;
//     }
     
//     public double getBalance() {
//         return balance; // Corrected to return the balance
//     }
     
//     public double getInterestRate() {
//         return interestRate;
//     }
     
//     public void setId(int id) {
//         this.id = id;
//     }
    
//     public void setInterestRate(double interestRate) {
//         this.interestRate = interestRate;
//     }
     
//     public void setBalance(double balance) {
//         this.balance = balance;
//     }
// }



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class ipa32 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        Document[] dc=new Document[4];
        for(int i=0;i<dc.length;i++)
        {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            dc[i]=new Document(a,b,c,d);
        }
        Document[] ans=docsWithOddPages(dc);
        if(ans!=null)
        {
            for(int i=0;i<ans.length;i++)
            {
                System.out.println(ans[i].getid()+" "+ans[i].gettitle()+" "+ans[i].getfolderName()+" "+ans[i].getpages());
            }
        }
    }
    
    public static Document[] docsWithOddPages(Document[]dc1)
    {
        Document[] b=new Document[0];
        Document del;
        for(int i=0;i<dc1.length;i++)
        {
            if(dc1[i].getpages()%2!=0)
            {
                b=Arrays.copyOf(b, b.length+1);
                b[b.length-1]=dc1[i];
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=i;j<b.length;j++)
            {
                if(b[i].getid()>b[j].getid())
                {
                    del=b[i];
                    b[i]=b[j];
                    b[j]=del;
                }
            }
        }
        if(b.length>0)
        {
            return b;
        }
        else{
            return null;
        }
        
    }
    
}
class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;
    public Document(int id,String title,String folderName,int pages){
        this.folderName=folderName;
        this.id=id;
        this.pages=pages;
        this.title=title;
    }
    
    public int getid()
    {
        return id;
    }
    public String gettitle()
    {
        return title;
    }
    public String getfolderName()
    {
        return folderName;
    }
    public int getpages()
    {
        return pages;
    }
    
    public void setid(int id)
    {
        this.id=id;
        
    }
    public void settitle(String title)
    {
        this.title=title;
    }
    public void setfolderName(String folderName)
    {
        this.folderName=folderName;
    }
    
    public void setpages(int pages)
    {
        this.pages=pages;
    }
}