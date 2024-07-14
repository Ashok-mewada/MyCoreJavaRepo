// Lecture 145 [Student Challange]
// Callback Method Example Using Interface
interface Member
{
    public void callback();
}
class Store 
{
    Member members[]=new Member[10];
    int count =0;
    void register(Member m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
        members[i].callback();
    }
}
class Customer implements Member
{
    String name;
    Customer (String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok ,I will VISIT,"+name);
    }
}
public class interfaceCallback {
    public static void main(String[] args) {
        Store s=new Store();
        Customer c1=new Customer("john");
        Customer c2=new Customer ("Smith");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
    
}
