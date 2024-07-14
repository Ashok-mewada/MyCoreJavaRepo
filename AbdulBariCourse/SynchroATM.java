// Lecture 193:Student Challange :ATM Machine using Synchronization
class ATM
{
    synchronized public void checkBalance(String name)
    {
        System.out.println(name+"Checking ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("Balance");
    }
    synchronized public void Withdraw (String name,int amount)
    {
        System.out.println(name+"Withdrawing");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(amount);
    }

}
class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    Customer (String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.Withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}
public class SynchroATM {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1=new Customer("Bharat",atm,100);
        Customer c2=new Customer("Ashish",atm,200);
        c1.start();
        c2.start();
    }
}
