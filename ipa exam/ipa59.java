
import java.util.*;
public class ipa59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount[] bk=new BankAccount[2];
        for(int i=0;i<bk.length;i++){
        int a=sc.nextInt();sc.nextLine();
        String b=sc.nextLine();
        int c=sc.nextInt();sc.nextLine();
        bk[i]=new BankAccount(a,b,c);
        }
        double d=scanner.nextDouble();sc.nextLine();
        String e=sc.nextLine();
        BankUtils bol=new BankUtils(bk[0],bk[1],d,e);
        Transaction ans=bol.transferFunds(bk[0], bk[1], d, e);
                System.out.println(ans.getTransactionCode());
                System.out.println(ans.getAmount());
                System.out.println(ans.getTimestamp());
            }
        }
        class BankAccount{
            private String accountNumber;
            private String accountHolderName;
            private double balance;
        
            public BankAccount(String accountNumber, String accountHolderName, double balance) {
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
        
        class BankUtils{
            private BankAccount fromaccount;
            private BankAccount toaccount;
            private double amount;
            private String transactionCode;
            public BankUtils(BankAccount fromaccount, BankAccount toaccount, double amount,String transactionCode)
            {
                this.fromaccount = fromaccount;
                this.toaccount = toaccount;
                this.amount = amount;
                this.transactionCode = transactionCode;
            }
        
            public Transaction transferFunds(BankAccount fromaccount, BankAccount toaccount, double amount,String transactionCode)
    {
        if(fromaccount.getBalance()>ammount)
        {
            fromaccount.setBalance(fromaccount.getBalance()-amount);
            toaccount.setBalance(toaccount.getBalance()+amount);
            return new Transaction(transactionCode, amount, "2023-04-01 10:30:00");
        }
        
    }
    public  void settransactionCode(String transactionCode)
    {
        this.transactionCode = transactionCode;
    }
    public String gettransactionCode()
    {
        return transactionCode;
    }
    public BankAccount getFromaccount() {
        return fromaccount;
    }
    public void setFromaccount(BankAccount fromaccount) {
        this.fromaccount = fromaccount;
    }
    public BankAccount getToaccount() {
        return toaccount;
    }
    public void setToaccount(BankAccount toaccount) {
        this.toaccount = toaccount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    } 
    
}

class Transaction{
    private String transactionCode;
    private double amount;
    private String timestamp;

    public Transaction(String transactionCode, double amount, String timestamp) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
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