import java.util.Scanner;

public class ipa37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount[]al=new BankAccount[2];
        for(int i=0;i<al.length;i++){
            System.out.print("Account ");
            int a=sc.nextInt();sc.nextLine();
            System.out.println(":");
            System.out.print("Account Number: ");
            String b=sc.nextLine();
            System.out.print("Account Holder Name: ");
            String c=sc.nextLine();
            System.out.println("Balance: ");
            double d=sc.nextDouble();sc.nextLine();
             al[i]=new BankAccount(b,c,d);   
        }
        System.out.println("Transfer Details:");
        System.out.print("Amount:");
        double ak=sc.nextDouble();sc.nextLine();
        System.out.print("Transaction Code: ");
        String e=sc.nextLine();
        System.out.println("Before Transfer:");
        for(int i=0;i<al.length;i++){
        System.out.print("Account "+(i+1)+": ");
        System.out.println(al[i].getAccountHolderName()+" - "+al[i].getAccountNumber()+" - "+al[i].getBalance());

        }
        
       
        Transaction ans1=BankUtils.transferfunds(al[0],al[1],ak,e);
        for(int i=0;i<al.length;i++){
        System.out.println(al[i].getAccountHolderName()+" - "+al[i].getAccountNumber()+" - "+al[i].getBalance());
        }

        System.out.println(ans1.getTransactionCode());
        System.out.println(ans1.getAmount());
        System.out.println(ans1.getTimestamp());
  
    }
}
class BankUtils{
    

    public static Transaction transferfunds(BankAccount fromAccount, BankAccount toAccount, double amount, String transactionCode) {
    fromAccount.setBalance(fromAccount.getBalance() - amount);
    toAccount.setBalance(toAccount.getBalance() + amount);
    String ap="2023-04-01 10:30:00";
    
    Transaction tr=new Transaction(transactionCode, amount, ap);
    return tr;
    
    }
}
class BankAccount {
private String accountNumber;
private String accountHolderName;
private double balance;

public BankAccount(String accountNumber, String accountHolderName, double balance)
{
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
}

public String getAccountNumber() {
    return accountNumber;
}

public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}

public String getAccountHolderName() {
    return accountHolderName;
}

public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
}

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}
 
}

class Transaction{
    private String transactionCode;
    private double amount;
    private String timestamp;

    public Transaction(String transactionCode, double amount, String timestamp) {
    this.amount=amount;
    this.transactionCode=transactionCode;
    this.timestamp=timestamp;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    
}