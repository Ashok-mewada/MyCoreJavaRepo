// Lecture  117 [Student Challange]
// Program : Customer and Product program using constructor and properties methods 
/* 
class Product{
    private String itemno;
    private String name;
    private double price;
    private int qty;
    public Product(String itemno,String name)
    {
       this.itemno=itemno;
       this.name=name;
    }
    public Product(String itemno,String name,double price,int qty)
    {
this.itemno=itemno;
this.name=name;
this.price=price;
this.qty=qty;
    }
    public String getItemno()
    {
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQty()
    {
        return qty;
    }
    public void setPrice(double p)
    {
   if (p>=0)
   price =p;
   else price=0;
    }
    public void setQty(int q)
    {
        if(q>=0)
        qty=q;
        else qty=0;
    }
  
}
class Customer{
private String custid;
private String name;
private String address;
private String phoneno;

public String getCustId()
{
    return custid;
}
public String getName()
{
    return name;
}

public String getAddress()
{
    return address;
}

public String getPhoneNo()
{
    return phoneno;
}
public void setAddress(String a)
{
    address=a;
}
public void setPhoneno(String b)
{
phoneno=b;
}
public Customer(String custid,String name)
{
    this.custid=custid;
    this.name=name;
}
public Customer(String custid,String name,String address,String phoneno)
{
    this.custid=custid;
    this.name=name;
    this.address=address;
    this.phoneno=phoneno;
}

}


public class constructprocus {
    public static void main(String[] args) {
        Product p=new Product("A-1012","CAMEL",448,5);
        System.out.println(p.getItemno());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQty());
        p.setPrice(566);
        System.out.println(p.getPrice());


Customer c=new Customer("a-1276836","rajkumar","heerapur","723823552368");
System.out.println(c.getCustId());
System.out.println(c.getName());
System.out.println(c.getAddress());
System.out.println(c.getPhoneNo());
c.setAddress("siyakhedi");
System.out.println(c.getAddress());
    }
}
*/
