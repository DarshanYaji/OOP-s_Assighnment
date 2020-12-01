/*Create a class  BankAccount having the members as given below:
accNo	integer
custName string
accType string (indicates ‘Savings’ or ‘Current’)
balance float

Include the following methods in the BankAccount class:
void deposit(float amt);
void withdraw(float amt);
float getBalance();
 	
deposit(float amt) method allows you to credit an amount into the current balance. If amount is negative, throw an exception NegativeAmount to block the operation from being performed.

withdraw(float amt) method allows you to debit an amount from the current balance. Please ensure a minimum balance of Rs. 1000/- in the account for savings account and Rs. 5000/- for current account, else throw an exception InsufficientFunds and block the withdrawal operation. Also throw an exception NegativeAmount to block the operation from being performed if the amt parameter passed to this function is negative.

getBalance() method returns the current balance. If the current balance is below the minimum required balance, then throw an exception LowBalanceException accordingly.

Have constructor to which you will pass, accno, cust_name, acctype and initial balance. 
And check whether the balance is less than 1000 or not in case of savings account and less than 5000 in case of a current account. If so, then raise a LowBalanceException. 
In either case if the balance is negative then raise the NegativeAmount exception accordingly.	*/
package exception_handling;
//class  BankAccount having the members
public class BankAccount 
{

    int account_number;
    String name;
    String account_type;
    double balance;
   
    public int getAccount_number() 
    {
        return account_number;
    }
   
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
   
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
   
    public String getAccount_type() {
        return account_type;
    }
   
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
   //getBalance() method returns the current balance.
    public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException nw)
        {
            System.out.println("Balance is low ="+balance);
        }
        }
       
       
        return balance;
       
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }//end setter and getter

    public BankAccount() {
       
        this.account_number = 100;
        this.name = "DarshanYaji";
        this.account_type = "Saving";
        this.balance = 500;
    }
   
   
   
   
    public BankAccount(int account_number, String name, String account_type,
            double balance) {
       
        this.account_number = account_number;
        this.name = name;
        this.account_type = account_type;
        this.balance = balance;
    }
    //deposit method allows you to credit an amount into the current balance
    void deposit(double amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf)
            {
                System.out.println("Negaive Amount cant be deposited");
            }
        }
        else
        {
            balance=getBalance()+amt;
            System.out.println("Current balance is ="+balance);
           
        }
       
       
       
    }
    //withdraw method allows you to debit an amount from the current balance
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException nf)
                {
                    System.out.println("WE CANT DEPOSITE AMOUNT INSUFFICENT BALANCE ");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
       
       
       
       
       
    }
     void display()
     {
    System.out.println("Balance is ="+getBalance());   
     }
   
   
   
   
    public static void main(String[] args) {
       
       
        BankAccount b=new BankAccount();
        b.deposit(2000);
        b.display();
        b.withdraw(500);
        b.display();
        b.withdraw(2000);
        b.getBalance();
        b.display();
       
       
       
    }
   
   
   
   
}