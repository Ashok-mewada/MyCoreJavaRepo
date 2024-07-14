
/*
class Account{
private String accNo;
private String name;
private String address;
private String phoneNo;
private String dob;
protected double balance;
private Account(String accNo,String name,String address,String phoneNo,String dob,double balance)
{
this.accNo=accNo;
this.name=name;
this.address=address;
this.phoneNo=phoneNo;
this.dob=dob;
this.balance=balance;
}
public String getaccNo()
{
    return accNo;
}
public String getname()
{
    return name;
}
public String getaddress()
{
    return address;
}
public String getphoneNo()
{
    return phoneNo;
}
public String getdob()
{
    return dob;
}
public double getbalance()
{
    return balance;
}
public void setAddres(String s)
{
address=s;
}
public void setphoneNo(String p)
{
    phoneNo=p;
}
public void CloseAccount()
{
    System.out.println("You closed your Account");
}
}
class SavingAccount extends Account{

public void deposit(double amt)
{
    balance=balance+amt;
}
public void withdraw(double amt)
{
    balance=balance-amt;
}
}
class LoanAccount extends Account
{
public void payEMI(double amt)
{
    balance=balance-amt;
}
public void repay(double amt)
{
    if(balance==amt)
    balance=0;
}
}

public class AccountInher {
    public static void main(String[] args) {
        
    }
}
*/                                                                                         