//Lecture 115 Practising Constructors[4 september 2022] 
/* 
class rectanglee
{
private double length;
private double breadth;
// counstructor without parameters
public rectanglee()
{
    length=1;
    breadth=1;
}
// constructor with parameters
public rectanglee(double l,double b)
{
    setlength(l);
    setbreadth(b);
}
public rectanglee(double s)
{
    length=breadth=s;
}
// properties method getter and setter methods

public double getlength()
{
  return length;
}
public double getbreadth()
{
    return breadth;
}
public void setlength(double l)
{
    if(l>=0)
    length=l;
    else length=0;
}
public void setbreadth(double b)
{
    if(b>=0) 
    breadth=b;
    else 
    breadth=0;
}
// methods for class
public double area()
{
    return getlength()*getbreadth();
}
public double perimeter()
{
    return 2*(length+breadth);
}
public boolean issquare()
{
    if(length==breadth)
    return true;
    else 
    return false;
}
}
public class constructor {
    public static void main(String[] args) {
         rectanglee r=new rectanglee(10,5);
    System.out.print("AREA of rectangle"+r.area());
    System.out.println("perimeter"+r.perimeter());
    System.out.println(r.getlength());
    System.out.println(r.getbreadth());
    System.out.println(r.issquare());
    }
}
*/